package com.adu.tinder.dataAccess.abstracts;

import com.adu.tinder.entities.concretes.Like;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LikeDao extends JpaRepository<Like,Integer> {
}
