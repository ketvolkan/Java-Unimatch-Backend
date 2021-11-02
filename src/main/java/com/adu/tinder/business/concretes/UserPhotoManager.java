package com.adu.tinder.business.concretes;

import com.adu.tinder.business.abstracts.UserPhotoService;
import com.adu.tinder.core.utilities.results.DataResult;
import com.adu.tinder.core.utilities.results.Result;
import com.adu.tinder.core.utilities.results.SuccessDataResult;
import com.adu.tinder.core.utilities.results.SuccessResult;
import com.adu.tinder.dataAccess.abstracts.UserPhotoDao;
import com.adu.tinder.entities.concretes.UserPhoto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserPhotoManager implements UserPhotoService {
    private UserPhotoDao userPhotoDao;
    @Autowired
    UserPhotoManager(UserPhotoDao userPhotoDao){
        this.userPhotoDao = userPhotoDao;
    }
    @Override
    public Result add(UserPhoto userPhoto) {
        this.userPhotoDao.save(userPhoto);
        return new SuccessResult("Ekleme Başarılı");
    }

    @Override
    public Result delete(int id) {
        this.userPhotoDao.deleteById(id);
        return new SuccessResult("Silme Başarılı");
    }

    @Override
    public Result update(UserPhoto userPhoto,int id) {
        UserPhoto updatedUserPhoto = this.userPhotoDao.getById(id).get(0);
        updatedUserPhoto.setPhotoUrl(userPhoto.getPhotoUrl());
        updatedUserPhoto.setUserId(userPhoto.getUserId());
        this.userPhotoDao.save(updatedUserPhoto);
        return new SuccessResult("Güncelleme Başarılı");
    }

    @Override
    public DataResult<List<UserPhoto>> getAll() {
        return new SuccessDataResult<List<UserPhoto>>(this.userPhotoDao.findAll(),"Listeleme Başarılı");
    }

    @Override
    public DataResult<List<UserPhoto>> getAllById(int id) {
        return new SuccessDataResult<List<UserPhoto>>(this.userPhotoDao.getById(id),"Listeleme Başarılı");
    }

    @Override
    public DataResult<List<UserPhoto>> getAllByUserId(int id) {
        return new SuccessDataResult<List<UserPhoto>>(this.userPhotoDao.getByUserId(id),"Listeleme Başarılı");
    }

    @Override
    public DataResult<List<UserPhoto>> getAllByPhotoUrl(String url) {
        return new SuccessDataResult<List<UserPhoto>>(this.userPhotoDao.getByPhotoUrl(url),"Listeleme Başarılı");
    }

    @Override
    public DataResult<List<UserPhoto>> getAllByActive(boolean active) {
        return new SuccessDataResult<List<UserPhoto>>(this.userPhotoDao.getByActive(active),"Listeleme Başarılı");
    }
}