package com.icome.service;

import com.icome.base.BaseTestClass;
import com.icome.pojo.Student;
import org.junit.Test;

import java.util.Date;

/**
 * Created by lenovo on 2019/5/8.
 */
public class StudentServiceImplTest extends BaseTestClass {

    private IStudentService service = (IStudentService) getInstance("studentService");

    @Test
    public void saveStudent(){
        Student student = new Student();
        student.setUserName("测试");
        student.setcTime(new Date());
        student.setPic("111");
        student.setOpenId("openId");
        student.setPhone("13000000000");
        student.setPosition("职位");
        student.setSchool("北京大学");
        System.out.println(service.saveStudent(student));

    }

    @Test
    public void get(){
        System.out.println(service.getStudent(1));
    }

    @Test
    public void getStudent(){
        System.out.println(service.getStudent("openId"));
    }
}
