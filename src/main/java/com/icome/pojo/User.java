package com.icome.pojo;

import java.util.Date;

/**
 * Created by lenovo on 2019/1/4.
 */
public class User {

    private int userId;

    //第三方的id
    private String thirdId;

    private String userName;

    //头像
    private String url;

    private Date cTime;

    private int status; //状态 0 未签到  1 已签到

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getThirdId() {
        return thirdId;
    }

    public void setThirdId(String thirdId) {
        this.thirdId = thirdId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Date getcTime() {
        return cTime;
    }

    public void setcTime(Date cTime) {
        this.cTime = cTime;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", thirdId='" + thirdId + '\'' +
                ", userName='" + userName + '\'' +
                ", url='" + url + '\'' +
                ", cTime=" + cTime +
                ", status=" + status +
                '}';
    }
}
