package com.adu.tinder.business.concretes;

import com.adu.tinder.business.abstracts.UserCheckService;
import com.adu.tinder.business.abstracts.UserService;
import com.adu.tinder.core.utilities.results.*;
import com.adu.tinder.dataAccess.abstracts.UserDao;
import com.adu.tinder.entities.concretes.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserManager implements UserService {
    private UserDao userDao;
    private UserCheckService userCheckService;
    @Autowired
    public UserManager(UserDao userDao,UserCheckService userCheckService) {
        this.userDao = userDao;
        this.userCheckService = userCheckService;
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
        if (userCheckService.allMatch(user)=="")
        {
            this.userDao.save(user);
            return new SuccessResult("Kaydetme Başarılı");
        }
        else{
            return new ErrorResult(userCheckService.allMatch(user));
        }

    }

    @Override
    public Result update(User user,int id) {
        User updatedUser = (this.userDao.getById(id)).get(0);
        updatedUser.setFirstName(user.getFirstName());
        updatedUser.setDescription(user.getDescription());
        updatedUser.setLastName(user.getLastName());
        updatedUser.setMail(user.getMail());
        updatedUser.setPhoneNumber(user.getPhoneNumber());
        updatedUser.setDateOfBirth(user.getDateOfBirth());
        updatedUser.setGender(user.getGender());
        if (userCheckService.findByMailForUpdate(updatedUser)==true)
        {
            this.userDao.save(updatedUser);
            return new SuccessResult("Güncelleme Başarılı");
        }
        else{
            return new ErrorResult("This Email Already Used");
        }
    }

    @Override
    public Result delete(int id) {
        this.userDao.deleteById(id);
        return new SuccessResult("Silme Başarılı");
    }

    @Override
    public Result setActive(int id,boolean control) {
        this.userDao.setActive(id,control);
        return new SuccessResult("Aktiflik Başarıyla " +control+" 'a çevrilmiştir");
    }
}
