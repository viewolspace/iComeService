package com.icome.dao;

import com.icome.pojo.Program;

import java.util.List;

/**
 * Created by lenovo on 2019/1/18.
 */
public interface ProgramDAO {

    List<Program> list();

    int updateNum(int id);

}
