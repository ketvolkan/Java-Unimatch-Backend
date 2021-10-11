package com.adu.tinder.dataAccess.abstracts;

import com.adu.tinder.entities.concretes.Blocked;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlockedDao extends JpaRepository<Blocked,Integer> {
}
