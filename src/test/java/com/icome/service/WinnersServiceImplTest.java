package com.icome.service;

import com.icome.base.BaseTestClass;
import com.icome.pojo.User;
import com.icome.pojo.Winners;
import org.junit.Test;

/**
 * Created by lenovo on 2019/1/4.
 */
public class WinnersServiceImplTest extends BaseTestClass {

    private IWinnersService service = (IWinnersService) getInstance("winnersService");

    private IUserService userService = (IUserService) getInstance("userService");

    public Winners winnersBean(){
        User user = userService.getUser(4);
        Winners winners = new Winners();
        winners.setUserId(user.getUserId());
        winners.setUserName(user.getUserName());
        winners.setUrl(user.getUrl());
        winners.setLevel(3);
        winners.setLevelName("三等奖");
        winners.setPrize("10块钱");
        return winners;
    }

    @Test
    public void saveWinners(){
        service.saveWinners(winnersBean());
    }

}
