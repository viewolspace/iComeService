package com.icome.pojo;

import java.util.Date;

/**
 * Created by lenovo on 2019/5/8.
 */
public class Question {
    private int id;
    private int userId;
    private String userName;
    private String pic;
    private String question;
    private int status; // 1 未回答  2 已回答
    private int flag;   // 1 未提取  2 已提取
    private Date cTime;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }

    public Date getcTime() {
        return cTime;
    }

    public void setcTime(Date cTime) {
        this.cTime = cTime;
    }

    @Override
    public String toString() {
        return "Question{" +
                "id=" + id +
                ", userId=" + userId +
                ", userName='" + userName + '\'' +
                ", pic='" + pic + '\'' +
                ", question='" + question + '\'' +
                ", status=" + status +
                ", flag=" + flag +
                ", cTime=" + cTime +
                '}';
    }
}
