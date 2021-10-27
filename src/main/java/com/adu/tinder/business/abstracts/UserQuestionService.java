package com.adu.tinder.business.abstracts;

import antlr.collections.impl.LList;
import com.adu.tinder.core.utilities.results.DataResult;
import com.adu.tinder.core.utilities.results.Result;
import com.adu.tinder.entities.concretes.UserQuestion;

import java.util.List;

public interface UserQuestionService {
    DataResult<List<UserQuestion>> getAll();
    DataResult<List<UserQuestion>> getById(int id);
    Result add(UserQuestion userQuestion);
    Result delete(UserQuestion userQuestion);
    Result update(UserQuestion userQuestion);
}
