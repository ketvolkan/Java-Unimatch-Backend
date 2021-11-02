package com.adu.tinder.dataAccess.abstracts;

import com.adu.tinder.core.utilities.results.DataResult;
import com.adu.tinder.entities.concretes.Match;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.List;
@Transactional
public interface MatchDao extends JpaRepository<Match,Integer> {
    List<Match> getByUserId1(int id);
    List<Match> getByUserId2(int id);
    List<Match> getByActive(boolean active);
    List<Match> getById(int id);
    @Modifying
    @Query("update Match j set j.active = true where j.id=:id")
    void setActive(@Param("id") int id);
}
