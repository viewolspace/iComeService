package com.icome.service.impl;

import com.icome.dao.ILuckDAO;
import com.icome.exception.ServiceException;
import com.icome.pojo.Luck;
import com.icome.pojo.User;
import com.icome.pojo.Winners;
import com.icome.pojo.query.UserQuery;
import com.icome.service.ILuckService;
import com.icome.service.IUserService;
import com.icome.service.IWinnersService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.*;

/**
 * describe:
 *
 * @date: 2019/01/05 08:48:8:48
 * @version: V1.0
 * @review:
 */
@Service("luckService")
public class LuckServiceImpl implements ILuckService {

    @Resource
    private IUserService userService;
    @Resource
    private IWinnersService winnersService;
    @Resource
    private ILuckDAO luckDAO;

    @Override
    public Luck getLuckInfo() {
        return luckDAO.getLuckInfo();
    }

    @Override
    public Luck getLuck(int id) {
        return luckDAO.getLuck(id);
    }

    @Override
    public int update(Luck pojo) {
        return luckDAO.update(pojo);
    }

    @Transactional("icomeTX")
    @Override
    public synchronized List<Winners> luckDraw(int luckId, int joinNum, int rewardNum) {
        //1、参数验证
        Luck luck = this.getLuck(luckId);
        if (null == luck) {
            throw new ServiceException("1001", "未查询到奖品信息，无法抽奖");
        }

        if(Luck.STATUS_FINISH == luck.getStatus()){
            throw new ServiceException("1001", "该奖品已抽完，无法再次抽取");
        }

        if (joinNum <= 0 || rewardNum <= 0) {
            throw new ServiceException("1002", "参与抽奖人数和抽取人数必须大于0");
        }

        if(luck.getRewardNum() != rewardNum){
            throw new ServiceException("1002", "传入的抽取人数和设定值不一致");
        }

        List<Winners> winnersList = winnersService.list();//全部已中奖用户
        UserQuery userQuery = new UserQuery();
        List<User> allUser = userService.queryUser(userQuery);//全部用户

        List<Integer> doneList = new ArrayList<>();
        List<Integer> allList = new ArrayList<>();
        Set<Integer> waitSet = new HashSet<>();

        if(null != winnersList){
            for (Winners winners : winnersList){
                doneList.add(winners.getUserId());
            }
        }

        if(null != allUser){
            for (User user : allUser){
                allList.add(user.getUserId());
            }
        }

        //从全部用户里剔除已中奖用户
        boolean flag = allList.removeAll(doneList);
        if(doneList.size()>0 && !flag){
            throw new ServiceException("1003", "从全部用户里剔除已中奖用户异常");
        }

        //保险起见，对未中奖用户userId去重
        for (User user : allUser){
            waitSet.add(user.getUserId());
        }

        if(waitSet.size() < rewardNum){
            throw new ServiceException("1003", "待抽奖人数小于本次抽取人数");
        }

        //2、抽奖
        List<Integer> waitList = new ArrayList<>(waitSet);
        List<Integer> luckList = randomLuck(waitList, rewardNum);
        if(null == luckList || luckList.size() != rewardNum){
            throw new ServiceException("1003", "抽到的中奖人数小于抽取人数");
        }

        //3、更新奖品状态，保存中奖纪录
        luck.setStatus(Luck.STATUS_FINISH);
        this.update(luck);

        List<Winners> resultList = new ArrayList<>();
        for(int userId : luckList){
            User user = userService.getUser(userId);
            if(null == user){
                throw new ServiceException("1003", "未查询到中奖用户"+user+"的个人信息");
            }
            Winners winners = new Winners();
            winners.setUserId(userId);
            winners.setUserName(user.getUserName());
            winners.setUrl(user.getUrl());
            winners.setLevel(luck.getId());
            winners.setLevelName(luck.getLevelName());
            winners.setPrize(luck.getPrize());
            winners.setcTime(new Date());

            winnersService.saveWinners(winners);

            resultList.add(winners);
        }

        //4、返回本次中奖人列表
        return resultList;
    }

    /**
     * 从List里面随机rewardNum个中奖用户
     * @param waitList
     * @param rewardNum
     * @return
     */
    private List<Integer> randomLuck(List<Integer> waitList, int rewardNum){
        List<Integer> luckList = new ArrayList<>();//中奖用户
        Random random = new Random();

        for(int i = 0 ; i < rewardNum ; i ++){
            int target = random.nextInt(waitList.size());
            if(!luckList.contains(waitList.get(target))){
                luckList.add(waitList.get(target));
            } else {
                i --;//随机到相同的用户ID时，做i--处理，重新随机
            }
        }

        return luckList;
    }
}
