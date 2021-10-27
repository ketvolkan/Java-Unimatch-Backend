package com.adu.tinder.business.abstracts;

import com.adu.tinder.core.utilities.results.DataResult;
import com.adu.tinder.core.utilities.results.Result;
import com.adu.tinder.entities.concretes.UserPhoto;


import java.util.List;

public interface UserPhotoService {
    Result add(UserPhoto userPhoto);
    Result delete(UserPhoto userPhoto);
    Result update(UserPhoto userPhoto);
    DataResult<List<UserPhoto>> getAll();
    DataResult<List<UserPhoto>> getAllById(int id);
    DataResult<List<UserPhoto>> getAllByUserId(int id);
    DataResult<List<UserPhoto>> getAllByPhotoUrl(String url);
    DataResult<List<UserPhoto>> getAllByActive(boolean active);
}
