package com.icome.api.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.icome.api.Config;
import com.icome.api.IComeApi;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.CoreConnectionPNames;
import org.apache.http.util.EntityUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.nio.charset.Charset;
import java.util.UUID;

/**
 * Created by lenovo on 2019/1/7.
 */
@Service("comeApi")
public class ComeApiImpl implements IComeApi {

    @Resource
    private Config config;

    private String token;

    private long sTime;

    @Override
    public String getToken() {
        if(token!=null && (System.currentTimeMillis() - sTime)/1000 < 7000){
            return token;
        }

        synchronized (this){
            if(token!=null && (System.currentTimeMillis() - sTime)/1000 < 7000){
                return token;
            }
            String url = config.getApi() + "licensor/access_token";
            JSONObject json = new JSONObject();
            json.put("appId",config.getAppId());
            json.put("appSecret",config.getSecret());
            String result = httpPostWithJson(json,url);
            JSONObject json_ret = JSON.parseObject(result);
            if(json_ret.getIntValue("errno")==0){
                token =   json_ret.getJSONObject("data").getString("access_token");
                sTime = System.currentTimeMillis();
            }else{
                return null;
            }
        }
        return token;


    }

    @Override
    public JSONObject getUserDetail(String ticket) {
        String temp_token = this.getToken();
        String url = config.getApi() + "licensor/userinfo";
        JSONObject json = new JSONObject();
        json.put("ticket",ticket);
        json.put("access_token",temp_token);
        String result = null;
        try {
            result = httpPostWithJson(json,url);
        }catch (Exception e){
            e.printStackTrace();
        }

        JSONObject json_ret = JSON.parseObject(result);
        if(json_ret!=null && json_ret.getIntValue("errno")==0){
            return  json_ret.getJSONObject("data") ;

        }else{
            return null;
        }

    }


    // 构建唯一会话Id
    public String getSessionId(){
        UUID uuid = UUID.randomUUID();
        String str = uuid.toString();
        return str.substring(0, 8) + str.substring(9, 13) + str.substring(14, 18) + str.substring(19, 23) + str.substring(24);
    }

    public String httpPostWithJson(JSONObject jsonObj,String url){
        boolean isSuccess = false;

        HttpPost post = null;
        try {
            HttpClient httpClient = new DefaultHttpClient();

            // 设置超时时间
            httpClient.getParams().setParameter(CoreConnectionPNames.CONNECTION_TIMEOUT, 2000);
            httpClient.getParams().setParameter(CoreConnectionPNames.SO_TIMEOUT, 2000);

            post = new HttpPost(url);
            // 构造消息头
            post.setHeader("Content-type", "application/json; charset=utf-8");
            post.setHeader("Connection", "Close");

            // 构建消息实体
            StringEntity entity = new StringEntity(jsonObj.toString(), Charset.forName("UTF-8"));
            entity.setContentEncoding("UTF-8");
            // 发送Json格式的数据请求
            entity.setContentType("application/json");
            post.setEntity(entity);

            HttpResponse response = httpClient.execute(post);

            // 检验返回码
            int statusCode = response.getStatusLine().getStatusCode();
            if(statusCode == HttpStatus.SC_OK){

                String content = EntityUtils.toString(response.getEntity());
                //{"errno":1150,"data":null,"error":"appId 或 appSecret 错误"}

                return content;
            }
        } catch (Exception e) {
            e.printStackTrace();
            isSuccess = false;
        }finally{
            if(post != null){
                try {
                    post.releaseConnection();
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        return null;
    }

}
