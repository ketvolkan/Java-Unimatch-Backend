package com.adu.tinder.dataAccess.abstracts;

import com.adu.tinder.entities.concretes.Match;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MatchDao extends JpaRepository<Match,Integer> {
}
