package com.icome.dao.impl;

import com.icome.dao.BaseDAO;
import com.icome.dao.IUserDAO;
import com.icome.pojo.User;
import com.icome.pojo.query.UserQuery;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by lenovo on 2019/1/4.
 */
@Repository("userDAO")
public class UserDAOImpl extends BaseDAO<User> implements IUserDAO  {
    @Override
    public int saveUser(User user) {
        user.setcTime(new Date());
        int result = super.insert(user);
        if(result>0){
            result = user.getUserId();
        }
        return result;
    }

    @Override
    public int updateStatus(int userId, int status) {
        Map<String,Object> map = new HashMap<>();
        map.put("userId",userId);
        map.put("status",status);
        return super.updateBy("updateStatus",map);
    }

    @Override
    public User getUser(int userId) {
        return super.get(userId);
    }

    @Override
    public User getUser(String thridId) {
        return super.findUniqueBy("selectByThird",thridId);
    }

    @Override
    public List<User> queryUser(UserQuery query) {
        return super.findBy("queryUser",query.getMap());
    }

    @Override
    public int queryTotalNum() {
        return super.count("queryTotalNum", null);
    }
}
