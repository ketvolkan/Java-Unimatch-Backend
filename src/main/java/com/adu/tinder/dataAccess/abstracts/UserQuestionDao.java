package com.adu.tinder.dataAccess.abstracts;

import com.adu.tinder.core.utilities.results.DataResult;
import com.adu.tinder.entities.concretes.UserQuestion;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserQuestionDao extends JpaRepository<UserQuestion,Integer> {
    List<UserQuestion> getById(int id);
}
