package com.adu.tinder.dataAccess.abstracts;

import com.adu.tinder.core.utilities.results.DataResult;
import com.adu.tinder.entities.concretes.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserDao extends JpaRepository<User,Integer> {
    List<User> getByPhoneNumber(String phoneNumber);
    List<User> getById(int id);
    List<User> getByNationalityId(String nationalityId);
    List<User> getByGender(char gender);
    List<User> getByVerifiedAccount(boolean verifiedAccount);
    List<User> getByMail(String mail);
    List<User> getByActive(boolean active);
}
