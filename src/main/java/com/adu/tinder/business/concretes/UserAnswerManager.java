package com.adu.tinder.business.concretes;

import com.adu.tinder.business.abstracts.UserAnswerService;
import com.adu.tinder.core.utilities.results.DataResult;
import com.adu.tinder.core.utilities.results.Result;
import com.adu.tinder.entities.concretes.UserAnswer;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserAnswerManager implements UserAnswerService {

    @Override
    public DataResult<List<UserAnswer>> getByUserId(int id) {
        return null;
    }

    @Override
    public DataResult<List<UserAnswer>> getByAnswer(int answer) {
        return null;
    }

    @Override
    public DataResult<List<UserAnswer>> getByQuestionId(int questionId) {
        return null;
    }

    @Override
    public DataResult<List<UserAnswer>> getAll() {
        return null;
    }

    @Override
    public Result add(UserAnswer userAnswer) {
        return null;
    }

    @Override
    public Result update(UserAnswer userAnswer) {
        return null;
    }

    @Override
    public Result delete(UserAnswer userAnswer) {
        return null;
    }
}
