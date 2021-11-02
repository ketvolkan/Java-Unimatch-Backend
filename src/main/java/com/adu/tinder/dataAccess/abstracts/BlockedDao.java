package com.adu.tinder.dataAccess.abstracts;


import com.adu.tinder.entities.concretes.Blocked;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.List;
@Transactional
public interface BlockedDao extends JpaRepository<Blocked,Integer> {
    List<Blocked> getByBlockedId(int id);
    List<Blocked> getByBlockingId(int id);
    List<Blocked> getByActive(boolean active);
    List<Blocked> getById(int id);
    @Modifying
    @Query("update Blocked j set j.active = true where j.id=:id")
    void setActive(@Param("id") int id);
}
