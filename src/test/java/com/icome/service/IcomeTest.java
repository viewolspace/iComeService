package com.icome.service;

import com.icome.api.IComeApi;
import com.icome.base.BaseTestClass;
import org.junit.Test;

/**
 * Created by lenovo on 2019/1/7.
 */
public class IcomeTest extends BaseTestClass {
    IComeApi service = (IComeApi)getInstance("comeApi");
    @Test
    public void getToken() {
        String token = service.getToken();
        System.out.println(service.getToken());
        System.out.println(service.getToken());
        System.out.println(service.getToken());
    }

    @Test
    public void getUserDetail(){
        System.out.println(service.getUserDetail("a82f43c9e352610aad285b0c1923514b"));
    }
}
