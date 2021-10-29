package com.adu.tinder.dataAccess.abstracts;

import com.adu.tinder.core.utilities.results.DataResult;
import com.adu.tinder.entities.concretes.QuestionAnswer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface QuestionAnswerDao extends JpaRepository<QuestionAnswer,Integer> {
    List<QuestionAnswer> getByQuestionId(int id);
    List<QuestionAnswer> getById(int id);
}
