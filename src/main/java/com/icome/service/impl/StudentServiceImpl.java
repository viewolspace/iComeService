package com.icome.service.impl;

import com.icome.dao.IStudentDAO;
import com.icome.pojo.Student;
import com.icome.service.IStudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by lenovo on 2019/5/8.
 */
@Service("studentService")
public class StudentServiceImpl implements IStudentService {

    @Resource
    private IStudentDAO studentDAO;

    @Override
    public int saveStudent(Student student) {
        return studentDAO.saveStudent(student);
    }

    @Override
    public Student getStudent(int id) {
        return studentDAO.getStudent(id);
    }

    @Override
    public Student getStudent(String openId) {
        return studentDAO.getStudent(openId);
    }
}
