package com.icome.pojo.query;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by lenovo on 2019/1/2.
 */
public class AlbumQuery extends BaseQuery {

    private Integer dirId;

    private Integer userId;

    public Integer getDirId() {
        return dirId;
    }

    public void setDirId(Integer dirId) {
        this.dirId = dirId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Map<String,Object> getMap(){
        Map<String,Object> map = new HashMap<>();
        if(dirId!=null){
            map.put("dirId",dirId);
        }
        if(userId!=null){
            map.put("userId",userId);
        }
        return map;
    }
}
