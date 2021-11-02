package com.adu.tinder.dataAccess.abstracts;

import com.adu.tinder.core.utilities.results.DataResult;
import com.adu.tinder.entities.concretes.User;
import com.adu.tinder.entities.concretes.UserAnswer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserAnswerDao extends JpaRepository<UserAnswer,Integer> {
    List<UserAnswer> getByUserId(int id);
    List<UserAnswer> getByAnswerId(int answerId);
    List<UserAnswer> getById(int id);
}
