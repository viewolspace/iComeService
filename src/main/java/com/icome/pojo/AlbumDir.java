package com.icome.pojo;

/**
 * Created by lenovo on 2019/1/2.
 * 相册目录
 */
public class AlbumDir {

    private int id;

    private int userId;

    private int canRead; //是否允许其他人读 0 允许  1不允许（需要密码）

    private int canWrite;

    private String pwd; //密码

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

    public int getCanRead() {
        return canRead;
    }

    public void setCanRead(int canRead) {
        this.canRead = canRead;
    }

    public int getCanWrite() {
        return canWrite;
    }

    public void setCanWrite(int canWrite) {
        this.canWrite = canWrite;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}
