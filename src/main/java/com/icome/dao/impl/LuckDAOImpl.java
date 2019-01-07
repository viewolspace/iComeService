package com.icome.dao.impl;

import com.icome.dao.BaseDAO;
import com.icome.dao.ILuckDAO;
import com.icome.pojo.Luck;
import org.springframework.stereotype.Repository;

/**
 * describe:
 *
 * @date: 2019/01/05 08:50:8:50
 * @version: V1.0
 * @review:
 */
@Repository("luckDAO")
public class LuckDAOImpl extends BaseDAO<Luck> implements ILuckDAO {
    @Override
    public Luck getLuckInfo() {
        return super.findUniqueBy("getLuckInfo", null);
    }

    @Override
    public int update(Luck pojo) {
        return super.update(pojo);
    }

    @Override
    public Luck getLuck(int id) {
        return super.get(id);
    }
}
