package com.icome.service.impl;

import com.icome.dao.IUserDAO;
import com.icome.pojo.User;
import com.icome.pojo.query.UserQuery;
import com.icome.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by lenovo on 2019/1/4.
 */
@Service("userService")
public class UserServiceImpl implements IUserService {

    @Resource
    private IUserDAO userDAO;

    @Override
    public int saveUser(User user) {
        return userDAO.saveUser(user);
    }

    @Override
    public int updateStatus(int userId, int status) {
        return userDAO.updateStatus(userId,status);
    }

    @Override
    public User getUser(int userId) {
        return userDAO.getUser(userId);
    }

    @Override
    public User getUser(String thridId) {
        return userDAO.getUser(thridId);
    }

    @Override
    public List<User> queryUser(UserQuery query) {
        return userDAO.queryUser(query);
    }
}
