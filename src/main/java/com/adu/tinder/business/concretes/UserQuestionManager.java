package com.adu.tinder.business.concretes;

import com.adu.tinder.business.abstracts.UserQuestionService;
import com.adu.tinder.core.utilities.results.DataResult;
import com.adu.tinder.core.utilities.results.Result;
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
        return null;
    }

    @Override
    public DataResult<List<UserQuestion>> getById(int id) {
        return null;
    }

    @Override
    public Result add(UserQuestion userQuestion) {
        return null;
    }

    @Override
    public Result delete(UserQuestion userQuestion) {
        return null;
    }

    @Override
    public Result update(UserQuestion userQuestion) {
        return null;
    }
}
