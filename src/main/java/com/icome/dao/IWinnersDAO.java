package com.icome.dao;

import com.icome.pojo.Winners;

import java.util.List;

/**
 * Created by lenovo on 2019/1/4.
 */
public interface IWinnersDAO {

    int saveWinners(Winners winners);


    Winners getWinners(int userId);


    List<Winners> list();

}
