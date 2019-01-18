package com.icome.service;

import com.icome.pojo.Program;
import com.icome.pojo.ProgramDetail;

import java.util.List;

/**
 * Created by lenovo on 2019/1/18.
 */
public interface IProgramService {

    List<Program> list();

    ProgramDetail getProgramDetail(String ticket);

    int vote(String ticket , int programId);
}
