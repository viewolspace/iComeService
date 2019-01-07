package com.icome.api;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * Created by lenovo on 2019/1/7.
 */
@Configuration
@PropertySource(value={"classpath:/properties/config.properties"})
public class Config {
    @Value("${appId}")
    private String appId;

    @Value("APPsecret")
    private String secret;

    @Value("api")
    private String api;

    public String getAppId() {
        return appId;
    }



    public String getSecret() {
        return secret;
    }



    public String getApi() {
        return api;
    }

}
