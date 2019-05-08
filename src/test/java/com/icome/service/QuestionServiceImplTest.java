package com.icome.service;

import com.icome.base.BaseTestClass;
import com.icome.pojo.Question;
import com.icome.pojo.query.QuestionQuery;
import org.junit.Test;

import java.util.Date;

/**
 * Created by lenovo on 2019/5/8.
 */
public class QuestionServiceImplTest  extends BaseTestClass {

    private IQuestionService service = (IQuestionService) getInstance("questionService");

    @Test
    public void saveQuestion(){
        Question question = new Question();
        question.setcTime(new Date());
        question.setUserId(1);
        question.setFlag(0);
        question.setStatus(0);
        question.setQuestion("这是哪里");

        System.out.println(service.saveQuestion(question));
    }
    @Test
    public void updateStatus(){
        service.updateStatus(1,1);
    }
    @Test
    public void updateFlag(){
        service.updateFlag(1,1);
    }
    @Test
    public void queryMy(){
        System.out.println(service.queryMy(2));
    }

    @Test
    public void queryQuestion(){
        QuestionQuery query = new QuestionQuery();
        query.setStatus(1);
        query.setFlag(1);
        System.out.println(service.queryQuestion(query));
    }
}
