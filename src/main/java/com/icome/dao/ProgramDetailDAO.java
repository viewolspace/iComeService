package com.icome.dao;

import com.icome.pojo.ProgramDetail;

/**
 * Created by lenovo on 2019/1/18.
 */
public interface ProgramDetailDAO {

    ProgramDetail getProgramDetail(String ticket);

    int saveProgramDetail(ProgramDetail programDetail);
}
