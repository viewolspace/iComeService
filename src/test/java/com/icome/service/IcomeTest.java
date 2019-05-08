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
        long stime = System.currentTimeMillis();

        for(int i=0;i<1000;i++){
            System.out.println(service.getUserDetail("6a0d818c2b4416962013f6bb5d3057c0"));
        }

        long etime = System.currentTimeMillis();
        System.out.println(etime-stime);
    }
}
