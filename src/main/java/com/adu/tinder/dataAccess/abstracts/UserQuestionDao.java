package com.adu.tinder.dataAccess.abstracts;

import com.adu.tinder.entities.concretes.UserQuestion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserQuestionDao extends JpaRepository<UserQuestion,Integer> {
}
