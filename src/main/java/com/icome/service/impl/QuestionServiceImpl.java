package com.icome.service.impl;

import com.icome.dao.QuestionDAO;
import com.icome.pojo.Question;
import com.icome.pojo.query.QuestionQuery;
import com.icome.service.IQuestionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by lenovo on 2019/5/8.
 */
@Service("questionService")
public class QuestionServiceImpl implements IQuestionService {
    @Resource
    private QuestionDAO dao;

    @Override
    public int saveQuestion(Question question) {
        return dao.saveQuestion(question);
    }

    @Override
    public Question getQuestion(int id) {
        return dao.getQuestion(id);
    }

    @Override
    public int delQuestion(int id) {
        Question question = dao.getQuestion(id);
        if(question!=null){
            if(question.getFlag()!=1){
                return  dao.delQuestion(id);
            }
        }
        return 0;
    }

    @Override
    public int updateStatus(int id, int status) {
        return dao.updateStatus(id, status);
    }

    @Override
    public int updateFlag(int id, int flag) {
        return dao.updateFlag(id, flag);
    }

    @Override
    public List<Question> queryMy(int userId) {
        return dao.queryMy(userId);
    }

    @Override
    public List<Question> queryQuestion(QuestionQuery query) {
        return dao.queryQuestion(query);
    }
}
