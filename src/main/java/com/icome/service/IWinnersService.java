package com.icome.service;

import com.icome.pojo.Winners;

import java.util.List;

/**
 * Created by lenovo on 2019/1/4.
 */
public interface IWinnersService {

    int saveWinners(Winners winners);

    Winners getWinners(int userId);

    //查询全部中奖用户
    List<Winners> list();

    /**
     * 根据奖品级别查询获奖者
     * @param level
     * @return
     */
    List<Winners> listByLevel(int level);
}
