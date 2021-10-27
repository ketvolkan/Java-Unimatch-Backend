package com.adu.tinder.business.abstracts;

import com.adu.tinder.core.utilities.results.DataResult;
import com.adu.tinder.core.utilities.results.Result;
import com.adu.tinder.entities.concretes.User;

import java.util.List;

public interface UserService {
    DataResult<List<User>> getAll();
    DataResult<List<User>> getByPhoneNumber(String phoneNumber);
    DataResult<List<User>> getById(int id);
    DataResult<List<User>> getByNationalityId(String nationalityId);
    DataResult<List<User>> getByGender(char gender);
    DataResult<List<User>> getByVerifiedAccount(boolean verifiedAccount);
    DataResult<List<User>> getByMail(String mail);
    DataResult<List<User>> getByActive(boolean active);
    Result add(User user);
    Result update(User user);
    Result delete(User user);
}
