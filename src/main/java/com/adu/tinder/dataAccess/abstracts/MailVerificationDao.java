package com.adu.tinder.dataAccess.abstracts;

import com.adu.tinder.entities.concretes.MailVerification;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MailVerificationDao extends JpaRepository<MailVerification,Integer> {
}
