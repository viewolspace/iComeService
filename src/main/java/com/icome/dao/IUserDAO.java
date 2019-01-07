package com.icome.dao;

import com.icome.pojo.User;
import com.icome.pojo.query.UserQuery;

import java.util.List;

/**
 * Created by lenovo on 2019/1/4.
 */
public interface IUserDAO {

    int saveUser(User user);

    int updateStatus(int userId,int status);

    User getUser(int userId);

    User getUser(String thridId);

    List<User> queryUser(UserQuery query);

    /**
     * 查询签到总人数，抽奖页面展示
     * @return
     */
    int queryTotalNum();
}
