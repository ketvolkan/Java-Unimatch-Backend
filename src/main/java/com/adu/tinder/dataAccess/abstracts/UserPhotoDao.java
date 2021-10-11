package com.adu.tinder.dataAccess.abstracts;

import com.adu.tinder.entities.concretes.UserPhoto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserPhotoDao extends JpaRepository<UserPhoto,Integer> {
}
