package com.adu.tinder.dataAccess.abstracts;

import com.adu.tinder.entities.concretes.Dislike;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DislikeDao extends JpaRepository<Dislike,Integer> {
}
