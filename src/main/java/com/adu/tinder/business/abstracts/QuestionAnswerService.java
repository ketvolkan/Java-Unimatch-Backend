package com.adu.tinder.business.abstracts;

import com.adu.tinder.core.utilities.results.DataResult;
import com.adu.tinder.core.utilities.results.Result;
import com.adu.tinder.entities.concretes.QuestionAnswer;

import java.util.List;

public interface QuestionAnswerService {
    DataResult<List<QuestionAnswer>> getAll();
    DataResult<List<QuestionAnswer>> getByQuestionId(int id);
    DataResult<List<QuestionAnswer>> getById(int id);
    Result add(QuestionAnswer questionAnswer);
    Result delete(QuestionAnswer questionAnswer);
    Result update(QuestionAnswer questionAnswer);
}
