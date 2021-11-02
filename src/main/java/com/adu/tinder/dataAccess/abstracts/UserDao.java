package com.adu.tinder.dataAccess.abstracts;

import com.adu.tinder.core.utilities.results.DataResult;
import com.adu.tinder.entities.concretes.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.List;
@Transactional
public interface UserDao extends JpaRepository<User,Integer> {
    List<User> getByPhoneNumber(String phoneNumber);
    List<User> getById(int id);
    List<User> getByGender(char gender);
    List<User> getByVerifiedAccount(boolean verifiedAccount);
    List<User> getByMail(String mail);
    List<User> getByActive(boolean active);
    @Modifying
    @Query("update User j set j.active = :control where j.id=:id")
    void setActive(@Param("id") int id,@Param("control") boolean control);

}
