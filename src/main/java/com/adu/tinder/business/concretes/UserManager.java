package com.adu.tinder.business.concretes;

import com.adu.tinder.business.abstracts.UserService;
import com.adu.tinder.core.utilities.results.DataResult;
import com.adu.tinder.core.utilities.results.Result;
import com.adu.tinder.core.utilities.results.SuccessDataResult;
import com.adu.tinder.core.utilities.results.SuccessResult;
import com.adu.tinder.dataAccess.abstracts.UserDao;
import com.adu.tinder.entities.concretes.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserManager implements UserService {
    private UserDao userDao;
    @Autowired
    public UserManager(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public DataResult<List<User>> getAll() {
        return new SuccessDataResult<List<User>>(userDao.findAll(),"Listeleme Başarılı");
    }

    @Override
    public DataResult<List<User>> getByPhoneNumber(String phoneNumber) {
        return new SuccessDataResult<List<User>>(userDao.getByPhoneNumber(phoneNumber),"Listeleme Başarılı");
    }

    @Override
    public DataResult<List<User>> getById(int id) {
        return new SuccessDataResult<List<User>>(userDao.getById(id),"Listeleme Başarılı");
    }

    @Override
    public DataResult<List<User>> getByNationalityId(String nationalityId) {
        return new SuccessDataResult<List<User>>(userDao.getByNationalityId(nationalityId),"Listeleme Başarılı");
    }

    @Override
    public DataResult<List<User>> getByGender(char gender) {
        return new SuccessDataResult<List<User>>(userDao.getByGender(gender),"Listeleme Başarılı");
    }

    @Override
    public DataResult<List<User>> getByVerifiedAccount(boolean verifiedAccount) {
        return new SuccessDataResult<List<User>>(userDao.getByVerifiedAccount(verifiedAccount),"Listeleme Başarılı");
    }

    @Override
    public DataResult<List<User>> getByMail(String mail) {
        return new SuccessDataResult<List<User>>(userDao.getByMail(mail),"Listeleme Başarılı");
    }

    @Override
    public DataResult<List<User>> getByActive(boolean active) {
        return new SuccessDataResult<List<User>>(userDao.getByActive(active),"Listeleme Başarılı");
    }

    @Override
    public Result add(User user) {
        this.userDao.save(user);
        return new SuccessResult("Listeleme Başarılı");
    }

    @Override
    public Result update(User user) {
        return null;
    }

    @Override
    public Result delete(User user) {
        return null;
    }
}
