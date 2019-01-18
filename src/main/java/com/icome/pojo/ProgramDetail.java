package com.icome.pojo;

import java.util.Date;

/**
 * Created by lenovo on 2019/1/18.
 */
public class ProgramDetail {

    private String ticket;

    private int programId;

    private Date createTime;

    public String getTicket() {
        return ticket;
    }

    public void setTicket(String ticket) {
        this.ticket = ticket;
    }

    public int getProgramId() {
        return programId;
    }

    public void setProgramId(int programId) {
        this.programId = programId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
