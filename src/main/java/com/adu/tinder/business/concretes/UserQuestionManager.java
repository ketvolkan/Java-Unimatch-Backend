package com.adu.tinder.business.concretes;

import com.adu.tinder.business.abstracts.UserQuestionService;
import com.adu.tinder.core.utilities.results.DataResult;
import com.adu.tinder.core.utilities.results.Result;
import com.adu.tinder.core.utilities.results.SuccessDataResult;
import com.adu.tinder.core.utilities.results.SuccessResult;
import com.adu.tinder.dataAccess.abstracts.UserQuestionDao;
import com.adu.tinder.entities.concretes.UserQuestion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserQuestionManager implements UserQuestionService {
    private UserQuestionDao userQuestionDao;
    @Autowired
    UserQuestionManager(UserQuestionDao userQuestionDao){this.userQuestionDao=userQuestionDao;}
    @Override
    public DataResult<List<UserQuestion>> getAll() {
        return new SuccessDataResult<List<UserQuestion>>(this.userQuestionDao.findAll(),"Sorular Başarıyla Listelendi");
    }

    @Override
    public DataResult<List<UserQuestion>> getById(int id) {
        return new SuccessDataResult<List<UserQuestion>>(this.userQuestionDao.getById(id),id+"'li soru Başarıyla Listelendi");
    }

    @Override
    public Result add(UserQuestion userQuestion) {
        this.userQuestionDao.save(userQuestion);
        return new SuccessResult("Ekleme Başarılı");
    }

    @Override
    public Result delete(int id) {
        this.userQuestionDao.deleteById(id);
        return new SuccessResult("Silme Başarılı");
    }

    @Override
    public Result update(UserQuestion userQuestion,int id) {
        UserQuestion updatedUserQuestion = this.userQuestionDao.getById(id).get(0);
        updatedUserQuestion.setQuestion(userQuestion.getQuestion());
        this.userQuestionDao.save(updatedUserQuestion);
        return new SuccessResult("Güncelleme Başarılı");
    }
}
