package com.icome.dao;

import com.icome.pojo.Question;
import com.icome.pojo.query.QuestionQuery;

import java.util.List;

/**
 * Created by lenovo on 2019/5/8.
 */
public interface QuestionDAO {
    int saveQuestion(Question question);

    Question getQuestion(int id);

    int delQuestion(int id);

    int updateStatus(int id,int status);

    int updateFlag(int id,int flag);

    List<Question> queryMy(int userId);

    List<Question> queryQuestion(QuestionQuery query);
}
