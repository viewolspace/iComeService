package com.icome.dao.impl;

import com.icome.dao.BaseDAO;
import com.icome.dao.IWinnersDAO;
import com.icome.pojo.Winners;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

/**
 * Created by lenovo on 2019/1/4.
 */
@Repository("winnersDAO")
public class WinnersDAOImpl extends BaseDAO<Winners> implements IWinnersDAO {
    @Override
    public int saveWinners(Winners winners) {
        winners.setcTime(new Date());
        int result = super.insert(winners);
        if(result > 0){
            result = winners.getId();
        }
        return result;
    }

    @Override
    public List<Winners> list() {
        return super.findBy("list",null);
    }

    @Override
    public Winners getWinners(int userId) {
        return super.findUniqueBy("getWinners",userId);
    }
}
