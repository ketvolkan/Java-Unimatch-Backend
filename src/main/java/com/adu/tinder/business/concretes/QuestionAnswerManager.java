package com.adu.tinder.business.concretes;

import com.adu.tinder.business.abstracts.QuestionAnswerService;
import com.adu.tinder.core.utilities.results.DataResult;
import com.adu.tinder.core.utilities.results.Result;
import com.adu.tinder.core.utilities.results.SuccessDataResult;
import com.adu.tinder.core.utilities.results.SuccessResult;
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
        return new SuccessDataResult<List<QuestionAnswer>>(this.questionAnswerDao.findAll(),"Listeleme Başarılı");
    }

    @Override
    public DataResult<List<QuestionAnswer>> getByQuestionId(int id) {
        return new SuccessDataResult<List<QuestionAnswer>>(this.questionAnswerDao.getByQuestionId(id),"Listeleme Başarılı");
    }

    @Override
    public DataResult<List<QuestionAnswer>> getById(int id) {
        return new SuccessDataResult<List<QuestionAnswer>>(this.questionAnswerDao.getById(id),"Listeleme Başarılı");
    }

    @Override
    public Result add(QuestionAnswer questionAnswer) {
        this.questionAnswerDao.save(questionAnswer);
        return new SuccessResult("Ekleme Başarılı");
    }

    @Override
    public Result delete(int id) {
        this.questionAnswerDao.deleteById(id);
        return new SuccessResult("Silme Başarılı");
    }

    @Override
    public Result update(QuestionAnswer questionAnswer, int id) {
        QuestionAnswer updatedQuestionAnswer = this.questionAnswerDao.getById(id).get(0);
        updatedQuestionAnswer.setAnswer(questionAnswer.getAnswer());
        updatedQuestionAnswer.setQuestionId(questionAnswer.getQuestionId());
        this.questionAnswerDao.save(updatedQuestionAnswer);
        return new SuccessResult("Güncelleme Başarılı");
    }
}
