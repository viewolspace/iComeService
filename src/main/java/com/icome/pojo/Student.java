package com.icome.pojo;

import java.util.Date;

/**
 * Created by lenovo on 2019/5/8.
 */
public class Student {
    private int id;

    private String userName;

    private String pic;

    private String school;

    private String position;

    private Date cTime;

    private String phone;

    private String openId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Date getcTime() {
        return cTime;
    }

    public void setcTime(Date cTime) {
        this.cTime = cTime;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }


    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", pic='" + pic + '\'' +
                ", school='" + school + '\'' +
                ", position='" + position + '\'' +
                ", cTime=" + cTime +
                ", phone='" + phone + '\'' +
                ", openId='" + openId + '\'' +
                '}';
    }
}
