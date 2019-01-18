package com.icome.service;

import com.icome.base.BaseTestClass;
import org.junit.Test;

/**
 * Created by lenovo on 2019/1/18.
 */
public class ProgramServiceImplTest  extends BaseTestClass {

    private IProgramService iProgramService = (IProgramService) getInstance("programService");

    @Test
    public void list() {
        System.out.println(iProgramService.list());
    }

    @Test
    public void getProgramDetail(){
        System.out.println(iProgramService.getProgramDetail("11111"));
    }

    @Test
    public void vote(){
        System.out.println(iProgramService.vote("11111",1));
    }

}
