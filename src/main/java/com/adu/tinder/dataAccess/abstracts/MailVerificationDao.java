package com.adu.tinder.dataAccess.abstracts;

import com.adu.tinder.core.utilities.results.DataResult;
import com.adu.tinder.entities.concretes.MailVerification;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MailVerificationDao extends JpaRepository<MailVerification,Integer> {
    List<MailVerification> getById(int id);
    List<MailVerification> getByCode(String code);
    List<MailVerification> getByUserId(int id);
    List<MailVerification> getByApproved(boolean approved);
}
