package com.icome.service;

import com.icome.pojo.Luck;
import com.icome.pojo.Winners;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ILuckService {

    /**
     * 查询当前要抽取的奖品信息
     * @return
     */
    Luck getLuckInfo();

    Luck getLuck(int id);

    /**
     * 抽奖完成，更新抽奖状态
     * @param pojo
     * @return
     */
    int update(Luck pojo);

    /**
     * 抽奖接口
     * @param luckId 奖品ID
     * @param joinNum 参与抽奖人数
     * @param rewardNum 抽取获奖人数
     * @return
     */
    List<Winners> luckDraw(int luckId, int joinNum, int rewardNum);
}
