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
        user.setUserName("李四1");
        user.setThirdId("2222");
        user.setStatus(0);
        user.setUrl("https://ss0.baidu.com/6ONWsjip0QIZ8tyhnq/it/u=2411564211,2114787003&fm=173&app=25&f=JPEG?w=218&h=146&s=FEF23DC48E462F5754ECC8830300D0C3");
        return user;
    }

    @Test
    public void saveUser(){
        service.saveUser(getUser());
    }

    @Test
    public void batchSaveUser(){
        User user =getUser();
        //往表里加入1000个测试用户
        for(int i = 1 ; i <= 1000 ; i ++){
            user.setUserName("张三"+i);
            user.setThirdId("icome"+i);
            user.setStatus(0);
            service.saveUser(user);
        }

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

    @Test
    public void testQueryTotalNum(){
        int total = service.queryTotalNum();
        System.out.println(total);
    }
}
