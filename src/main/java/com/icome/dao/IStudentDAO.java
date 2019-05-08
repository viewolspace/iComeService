package com.icome.dao;

import com.icome.pojo.Student;

/**
 * Created by lenovo on 2019/5/8.
 */
public interface IStudentDAO {

    int saveStudent(Student student);

    Student getStudent(int id);

    Student getStudent(String openId);
}
