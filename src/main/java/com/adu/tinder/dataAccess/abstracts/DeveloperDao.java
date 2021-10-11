package com.adu.tinder.dataAccess.abstracts;

import com.adu.tinder.entities.concretes.Developer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeveloperDao extends JpaRepository<Developer,Integer> {
}
