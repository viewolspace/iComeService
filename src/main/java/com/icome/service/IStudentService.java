package com.icome.service;

import com.icome.pojo.Student;

/**
 * Created by lenovo on 2019/5/8.
 */
public interface IStudentService {
    int saveStudent(Student student);

    Student getStudent(int id);

    Student getStudent(String openId);
}
