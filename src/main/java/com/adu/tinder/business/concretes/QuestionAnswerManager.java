package com.adu.tinder.business.concretes;

import com.adu.tinder.business.abstracts.QuestionAnswerService;
import com.adu.tinder.core.utilities.results.DataResult;
import com.adu.tinder.core.utilities.results.Result;
import com.adu.tinder.dataAccess.abstracts.QuestionAnswerDao;
import com.adu.tinder.entities.concretes.QuestionAnswer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionAnswerManager implements QuestionAnswerService {

    private QuestionAnswerDao questionAnswerDao;
    @Autowired
    public QuestionAnswerManager(QuestionAnswerDao questionAnswerDao) {
        this.questionAnswerDao = questionAnswerDao;
    }

    @Override
    public DataResult<List<QuestionAnswer>> getAll() {
        return null;
    }

    @Override
    public DataResult<List<QuestionAnswer>> getByQuestionId(int id) {
        return null;
    }

    @Override
    public DataResult<List<QuestionAnswer>> getById(int id) {
        return null;
    }

    @Override
    public Result add(QuestionAnswer questionAnswer) {
        return null;
    }

    @Override
    public Result delete(QuestionAnswer questionAnswer) {
        return null;
    }

    @Override
    public Result update(QuestionAnswer questionAnswer) {
        return null;
    }
}
