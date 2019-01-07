package com.icome.service;

import com.icome.base.BaseTestClass;
import com.icome.pojo.User;
import com.icome.pojo.query.UserQuery;
import org.junit.Test;

import java.util.List;

/**
 * Created by lenovo on 2019/1/4.
 */
public class UserServiceImplTest extends BaseTestClass {
    private IUserService service = (IUserService) getInstance("userService");

    public User getUser(){
        User user = new User();
        user.setUserName("王五");
        user.setThirdId("1112222");
        user.setStatus(1);
        user.setUrl("https://ss0.baidu.com/6ONWsjip0QIZ8tyhnq/it/u=2411564211,2114787003&fm=173&app=25&f=JPEG?w=218&h=146&s=FEF23DC48E462F5754ECC8830300D0C3");
        return user;
    }

    @Test
    public void saveUser(){
        service.saveUser(getUser());
    }

    @Test
    public void updateStatus(){
        service.updateStatus(4, 1);
    }

    @Test
    public void getUserInt(){
        System.out.println(service.getUser(4));
    }

    @Test
    public void getUserString(){
        System.out.println(service.getUser("1111"));
    }

    @Test
    public void queryUser(){
        UserQuery query = new UserQuery();
        query.setLastMaxUid(4);
        query.setStatus(1);
        List<User> list = service.queryUser(query);
        System.out.println(list);
    }

}
