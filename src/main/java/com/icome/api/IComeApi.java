package com.icome.api;

import com.alibaba.fastjson.JSONObject;

/**
 * Created by lenovo on 2019/1/7.
 */
public interface IComeApi {

    String getToken();

    JSONObject getUserDetail();
}
