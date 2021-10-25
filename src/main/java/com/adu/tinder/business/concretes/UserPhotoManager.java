package com.adu.tinder.business.concretes;

import com.adu.tinder.core.utilities.results.DataResult;
import com.adu.tinder.core.utilities.results.Result;
import com.adu.tinder.entities.concretes.UserPhoto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserPhotoManager implements com.adu.tinder.business.abstracts.UserPhotoManager{

    @Override
    public Result add(UserPhoto userPhoto) {
        return null;
    }

    @Override
    public Result delete(UserPhoto userPhoto) {
        return null;
    }

    @Override
    public Result update(UserPhoto userPhoto) {
        return null;
    }

    @Override
    public DataResult<List<UserPhoto>> getAll() {
        return null;
    }

    @Override
    public DataResult<List<UserPhoto>> getAllById(int id) {
        return null;
    }

    @Override
    public DataResult<List<UserPhoto>> getAllByUserId(int id) {
        return null;
    }

    @Override
    public DataResult<List<UserPhoto>> getAllByPhotoUrl(String url) {
        return null;
    }

    @Override
    public DataResult<List<UserPhoto>> getAllByActive(boolean active) {
        return null;
    }
}