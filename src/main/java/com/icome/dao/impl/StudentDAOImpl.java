package com.icome.dao.impl;

import com.icome.dao.BaseDAO;
import com.icome.dao.IStudentDAO;
import com.icome.pojo.Student;
import org.springframework.stereotype.Repository;

/**
 * Created by lenovo on 2019/5/8.
 */
@Repository("studentDAO")
public class StudentDAOImpl extends BaseDAO<Student> implements IStudentDAO {
    @Override
    public int saveStudent(Student student) {
        return super.insert(student);
    }

    @Override
    public Student getStudent(int id) {
        return super.get(id);
    }

    @Override
    public Student getStudent(String openId) {
        return super.findUniqueBy("selectByThird",openId);
    }
}
