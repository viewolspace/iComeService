package com.icome.pojo.query;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by lenovo on 2019/5/8.
 */
public class QuestionQuery {
    private Integer id ;
    private Integer status; // 1 未回答  2 已回答
    private Integer flag;   // 1 未提取  2 已提取

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Map<String,Object> getMap(){
        Map<String,Object> map = new HashMap<>();
        if(status!=null && status !=0){
            map.put("status",status);
        }
        if(flag!=null && flag!=0){
            map.put("flag",flag);
        }
        if(id!=null){
            map.put("id",id);
        }
        return map;
    }
}
