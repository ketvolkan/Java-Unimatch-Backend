package com.adu.tinder.dataAccess.abstracts;

import com.adu.tinder.core.utilities.results.DataResult;
import com.adu.tinder.entities.concretes.Developer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DeveloperDao extends JpaRepository<Developer,Integer> {
    List<Developer> getById(int id);
}
