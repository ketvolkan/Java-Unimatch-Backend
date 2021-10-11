package com.adu.tinder.dataAccess.abstracts;

import com.adu.tinder.entities.concretes.PhoneNumberVerification;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PhoneNumberVerificationDao extends JpaRepository<PhoneNumberVerification,Integer> {
}
