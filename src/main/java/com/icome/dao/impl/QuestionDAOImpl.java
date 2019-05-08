package com.icome.dao.impl;

import com.icome.dao.BaseDAO;
import com.icome.dao.QuestionDAO;
import com.icome.pojo.Question;
import com.icome.pojo.query.QuestionQuery;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by lenovo on 2019/5/8.
 */
@Repository("questionDAO")
public class QuestionDAOImpl extends BaseDAO<Question> implements QuestionDAO{
    @Override
    public int saveQuestion(Question question) {
        return super.insert(question);
    }

    @Override
    public int delQuestion(int id) {
        return super.delete(id);
    }

    @Override
    public Question getQuestion(int id) {
        return super.get(id);
    }

    @Override
    public int updateStatus(int id, int status) {
        QuestionQuery query = new QuestionQuery();
        query.setId(id);
        query.setStatus(status);
        return super.updateBy("updateStatus",query.getMap());
    }

    @Override
    public int updateFlag(int id, int flag) {
        QuestionQuery query = new QuestionQuery();
        query.setId(id);
        query.setFlag(flag);
        return super.updateBy("updateFlag",query.getMap());
    }

    @Override
    public List<Question> queryMy(int userId) {
        return super.findBy("queryMyquestion",userId);
    }

    @Override
    public List<Question> queryQuestion(QuestionQuery query) {

        return super.findBy("queryQuestion",query.getMap());
    }
}
