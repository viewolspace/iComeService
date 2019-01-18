package com.icome.dao.impl;

import com.icome.dao.BaseDAO;
import com.icome.dao.ProgramDAO;
import com.icome.pojo.Program;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by lenovo on 2019/1/18.
 */
@Repository("programDAO")
public class ProgramDAOImpl extends BaseDAO<Program> implements ProgramDAO {

    @Override
    public List<Program> list() {
        return super.findBy("selectAll",null);
    }

    @Override
    public int updateNum(int id) {
        return super.updateBy("updateNum",id);
    }
}
