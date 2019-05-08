package com.icome.service;

import com.icome.pojo.Question;
import com.icome.pojo.query.QuestionQuery;

import java.util.List;

/**
 * Created by lenovo on 2019/5/8.
 */
public interface IQuestionService {
    int saveQuestion(Question question);

    int delQuestion(int id);

    int updateStatus(int id,int status);

    int updateFlag(int id,int flag);

    List<Question> queryMy(int userId);

    List<Question> queryQuestion(QuestionQuery query);
}
