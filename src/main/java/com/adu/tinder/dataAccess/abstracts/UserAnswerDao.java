package com.adu.tinder.dataAccess.abstracts;

import com.adu.tinder.entities.concretes.UserAnswer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserAnswerDao extends JpaRepository<UserAnswer,Integer> {
}
