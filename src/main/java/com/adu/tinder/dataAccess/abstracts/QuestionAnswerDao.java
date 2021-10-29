package com.adu.tinder.dataAccess.abstracts;

import com.adu.tinder.entities.concretes.QuestionAnswer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionAnswerDao extends JpaRepository<QuestionAnswer,Integer> {

}
