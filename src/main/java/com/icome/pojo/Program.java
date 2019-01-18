package com.icome.pojo;

import java.util.Date;

/**
 * Created by lenovo on 2019/1/18.
 */
public class Program {
    private int id;

    private String name;

    private int seq;

    private int num;

    private Date createTime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSeq() {
        return seq;
    }

    public void setSeq(int seq) {
        this.seq = seq;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Program{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", seq=" + seq +
                ", num=" + num +
                ", createTime=" + createTime +
                '}';
    }
}
