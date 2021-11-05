package com.adu.tinder.business.concretes;

import com.adu.tinder.business.abstracts.UserCheckService;
import com.adu.tinder.dataAccess.abstracts.UserDao;
import com.adu.tinder.entities.concretes.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.crypto.Data;

@Service
public class UserCheckManager implements UserCheckService {
    private UserDao userDao;
    @Autowired
    public UserCheckManager(UserDao userDao) {this.userDao = userDao;}
    @Override
    public boolean allFieldsAreRequired(User user) {
        if (user.getMail().strip().isEmpty()
                || user.getMail().strip().isEmpty()
                || user.getDescription().strip().isEmpty()
                || user.getFirstName().strip().isEmpty()
                || user.getLastName().strip().isEmpty()
                || (Character.toString(user.getGender())).strip().isEmpty()
                || user.getPhoneNumber().strip().isEmpty())
        {return false;}
        else
        {return true;}
    }

    @Override
    public boolean findByMail(User user) {
        if(this.userDao.getByMail(user.getMail()).size()!=0) {
            return false;
        }
        else {return true;}
    }
    public boolean findByPhoneNumber(User user) {
        if(this.userDao.getByPhoneNumber(user.getPhoneNumber()).size()!=0) {

            return false;
        }
        else {return true;}
    }

    @Override
    public String allMatch(User user) {
        String errorMessage = "";
        boolean checkFields = allFieldsAreRequired(user);
        boolean checkEmail = findByMail(user);
        boolean checkPhoneNumber = findByPhoneNumber(user);
        if (!checkEmail || !checkFields || !checkPhoneNumber) {

            if (!checkEmail) {
                errorMessage += "-This Email Already Used-";
            }

            if (!checkFields) {
                errorMessage += "-Please Fill All Fields-";
            }
            if (!checkPhoneNumber) {
                errorMessage += "-This Phone Number Already Used-";
            }

        }
        return errorMessage;
    }

    @Override
    public String allMatchForUpdate(User user) {
        String errorMessage = "";
        boolean checkEmail = findByMailForUpdate(user);
        boolean checkPhoneNumber = findByPhoneNumberForUpdate(user);
        if (!checkEmail || !checkPhoneNumber) {

            if (!checkEmail) {
                errorMessage += "-This Email Already Used-";
            }

            if (!checkPhoneNumber) {
                errorMessage += "-This Phone Number Already Used-";
            }

        }
        return errorMessage;
    }

    @Override
    public boolean findByMailForUpdate(User user) {
        if(this.userDao.getByMail(user.getMail()).size()!=0) {
            if((this.userDao.getByMail(user.getMail()).get(0).getId()==user.getId())){
                return true;
            }else{
            return false;}
        }
        else {return true;}
    }
    @Override
    public boolean findByPhoneNumberForUpdate(User user) {
        if(this.userDao.getByPhoneNumber(user.getPhoneNumber()).size()!=0) {
            if((this.userDao.getByPhoneNumber(user.getPhoneNumber()).get(0).getId()==user.getId())){
                return true;
            }else{
                return false;}
        }
        else {return true;}
    }
}
