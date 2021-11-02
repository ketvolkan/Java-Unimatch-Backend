package com.adu.tinder.business.abstracts;

import com.adu.tinder.core.utilities.results.DataResult;
import com.adu.tinder.core.utilities.results.Result;
import com.adu.tinder.entities.concretes.UserAnswer;

import java.util.List;

public interface UserAnswerService {
    DataResult<List<UserAnswer>> getByUserId(int id);
    DataResult<List<UserAnswer>> getByAnswer(int answer);
    DataResult<List<UserAnswer>> getById(int id);
    DataResult<List<UserAnswer>> getAll();
    Result add(UserAnswer userAnswer);
    Result update(UserAnswer userAnswer,int id);
    Result delete(int id);
}
