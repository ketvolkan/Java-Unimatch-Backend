package com.adu.tinder.dataAccess.abstracts;

import com.adu.tinder.entities.concretes.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User,Integer> {
}
