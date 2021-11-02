package com.adu.tinder.business.concretes;

import com.adu.tinder.business.abstracts.UserAnswerService;
import com.adu.tinder.core.utilities.results.DataResult;
import com.adu.tinder.core.utilities.results.Result;
import com.adu.tinder.core.utilities.results.SuccessDataResult;
import com.adu.tinder.core.utilities.results.SuccessResult;
import com.adu.tinder.dataAccess.abstracts.UserAnswerDao;
import com.adu.tinder.entities.concretes.User;
import com.adu.tinder.entities.concretes.UserAnswer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserAnswerManager implements UserAnswerService {
    private UserAnswerDao userAnswerDao;
    @Autowired
    public UserAnswerManager(UserAnswerDao userAnswerDao) {
        this.userAnswerDao = userAnswerDao;
    }

    @Override
    public DataResult<List<UserAnswer>> getByUserId(int id) {
        return new SuccessDataResult<List<UserAnswer>>(this.userAnswerDao.getByUserId(id),"Listeleme Başarılı");
    }

    @Override
    public DataResult<List<UserAnswer>> getByAnswer(int answer) {
        return new SuccessDataResult<List<UserAnswer>>(this.userAnswerDao.getByAnswerId(answer),"Listeleme Başarılı");
    }

    @Override
    public DataResult<List<UserAnswer>> getById(int id) {
        return new SuccessDataResult<List<UserAnswer>>(this.userAnswerDao.getById(id),"Listeleme Başarılı");
    }


    @Override
    public DataResult<List<UserAnswer>> getAll() {
        return new SuccessDataResult<List<UserAnswer>>(this.userAnswerDao.findAll(),"Listeleme Başarılı");
    }

    @Override
    public Result add(UserAnswer userAnswer) {
        this.userAnswerDao.save(userAnswer);
        return new SuccessResult("Ekleme Başarılı");
    }

    @Override
    public Result update(UserAnswer userAnswer,int id) {
        UserAnswer updatedUserAnswer = this.userAnswerDao.getById(id).get(0);
        updatedUserAnswer.setAnswerId(userAnswer.getAnswerId());
        updatedUserAnswer.setUserId(userAnswer.getUserId());
        return new SuccessResult("Güncelleme Başarılı");
    }

    @Override
    public Result delete(int id) {
        this.userAnswerDao.deleteById(id);
        return new SuccessResult("Silme Başarılı");
    }
}
