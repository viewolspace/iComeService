package com.icome.service.impl;

import com.icome.dao.IWinnersDAO;
import com.icome.pojo.Winners;
import com.icome.service.IWinnersService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by lenovo on 2019/1/4.
 */
@Service("winnersService")
public class WinnersServiceImpl implements IWinnersService {

    @Resource
    private IWinnersDAO winnersDAO;

    @Override
    public int saveWinners(Winners winners) {
        return winnersDAO.saveWinners(winners);
    }

    @Override
    public Winners getWinners(int userId) {
        return winnersDAO.getWinners(userId);
    }

    @Override
    public List<Winners> list() {
        return winnersDAO.list();
    }
}
