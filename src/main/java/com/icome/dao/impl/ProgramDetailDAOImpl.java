package com.icome.dao.impl;

import com.icome.dao.BaseDAO;
import com.icome.dao.ProgramDetailDAO;
import com.icome.pojo.ProgramDetail;
import org.springframework.stereotype.Repository;

/**
 * Created by lenovo on 2019/1/18.
 */
@Repository("programDetailDAO")
public class ProgramDetailDAOImpl extends BaseDAO<ProgramDetail> implements ProgramDetailDAO {

    @Override
    public ProgramDetail getProgramDetail(String ticket) {
        return super.get(ticket);
    }

    @Override
    public int saveProgramDetail(ProgramDetail programDetail) {
        return super.insert(programDetail);
    }
}
