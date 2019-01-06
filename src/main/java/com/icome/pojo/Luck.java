package com.icome.pojo;

import java.util.Date;

/**
 * describe: 奖品信息
 *
 * @date: 2019/01/05 08:00:8:00
 * @version: V1.0
 * @review:
 */
public class Luck {

    public static final int STATUS_INIT = 0;//初始状态，未抽奖
    public static final int STATUS_FINISH = 1;//已抽奖

    //奖品ID(奖品级别，要保持顺序)
    private int id;

    //级别名称 （几等奖）
    private String levelName;

    //奖品名称
    private String prize;

    //奖品数量
    private int luckNum;

    //抽取人数
    private int rewardNum;

    //奖品图片地址
    private String img;

    //奖品状态，0-待抽奖，1-已抽奖，不能重复抽
    private int status;

    //创建时间
    private Date createTime;

    //签到人数
    private int joinNum;

    public Luck() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLevelName() {
        return levelName;
    }

    public void setLevelName(String levelName) {
        this.levelName = levelName;
    }

    public String getPrize() {
        return prize;
    }

    public void setPrize(String prize) {
        this.prize = prize;
    }

    public int getLuckNum() {
        return luckNum;
    }

    public void setLuckNum(int luckNum) {
        this.luckNum = luckNum;
    }

    public int getRewardNum() {
        return rewardNum;
    }

    public void setRewardNum(int rewardNum) {
        this.rewardNum = rewardNum;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public int getJoinNum() {
        return joinNum;
    }

    public void setJoinNum(int joinNum) {
        this.joinNum = joinNum;
    }

    @Override
    public String toString() {
        return "Luck{" +
                "id=" + id +
                ", levelName='" + levelName + '\'' +
                ", prize='" + prize + '\'' +
                ", luckNum='" + luckNum + '\'' +
                ", rewardNum=" + rewardNum +
                ", img='" + img + '\'' +
                ", status=" + status +
                ", createTime=" + createTime +
                '}';
    }
}
