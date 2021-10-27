package com.adu.tinder.business.concretes;

import com.adu.tinder.business.abstracts.UserService;
import com.adu.tinder.core.utilities.results.DataResult;
import com.adu.tinder.core.utilities.results.Result;
import com.adu.tinder.entities.concretes.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserManager implements UserService {
    @Override
    public DataResult<List<User>> getAll() {
        return null;
    }

    @Override
    public DataResult<List<User>> getByPhoneNumber(String phoneNumber) {
        return null;
    }

    @Override
    public DataResult<List<User>> getById(int id) {
        return null;
    }

    @Override
    public DataResult<List<User>> getByNationalityId(String nationalityId) {
        return null;
    }

    @Override
    public DataResult<List<User>> getByGender(char gender) {
        return null;
    }

    @Override
    public DataResult<List<User>> getByVerifiedAccount(boolean verifiedAccount) {
        return null;
    }

    @Override
    public DataResult<List<User>> getByMail(String mail) {
        return null;
    }

    @Override
    public DataResult<List<User>> getByActive(boolean active) {
        return null;
    }

    @Override
    public Result add(User user) {
        return null;
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
