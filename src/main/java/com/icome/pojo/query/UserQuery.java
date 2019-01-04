package com.icome.pojo.query;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by lenovo on 2019/1/4.
 */
public class UserQuery extends BaseQuery{

    private Integer lastMaxUid;

    private Integer status;

    public Integer getLastMaxUid() {
        return lastMaxUid;
    }

    public void setLastMaxUid(Integer lastMaxUid) {
        this.lastMaxUid = lastMaxUid;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Map<String,Object> getMap(){
        Map<String,Object> map = new HashMap<>();
        if(lastMaxUid!=null){
            map.put("lastMaxUid",lastMaxUid);
        }
        if(status!=null){
            map.put("status",status);
        }
        return map;
    }
}
