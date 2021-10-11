package com.adu.tinder.dataAccess.abstracts;

import com.adu.tinder.entities.concretes.Chat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChatDao extends JpaRepository<Chat,Integer> {
}
