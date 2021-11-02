package com.adu.tinder.dataAccess.abstracts;

import com.adu.tinder.core.utilities.results.DataResult;
import com.adu.tinder.entities.concretes.Like;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LikeDao extends JpaRepository<Like,Integer> {
    List<Like> getByLikesId(int id);
    List<Like> getByPopularId(int id);
    List<Like> getById(int id);
}
