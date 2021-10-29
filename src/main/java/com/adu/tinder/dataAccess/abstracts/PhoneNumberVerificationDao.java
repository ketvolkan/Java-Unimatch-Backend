package com.adu.tinder.dataAccess.abstracts;

import com.adu.tinder.entities.concretes.MailVerification;
import com.adu.tinder.entities.concretes.PhoneNumberVerification;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PhoneNumberVerificationDao extends JpaRepository<PhoneNumberVerification,Integer> {
    List<PhoneNumberVerification> getById(int id);
    List<PhoneNumberVerification> getByCode(String code);
    List<PhoneNumberVerification> getByUserId(int id);
    List<PhoneNumberVerification> getByApproved(boolean approved);
}
