package com.adu.tinder.dataAccess.abstracts;

import com.adu.tinder.core.utilities.results.DataResult;
import com.adu.tinder.entities.concretes.UserPhoto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserPhotoDao extends JpaRepository<UserPhoto,Integer> {
    List<UserPhoto> getById(int id);
    List<UserPhoto> getByUserId(int id);
    List<UserPhoto> getByPhotoUrl(String url);
    List<UserPhoto> getByActive(boolean active);
}
