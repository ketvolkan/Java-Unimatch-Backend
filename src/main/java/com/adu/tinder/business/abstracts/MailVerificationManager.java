package com.adu.tinder.business.abstracts;

import com.adu.tinder.core.utilities.results.DataResult;
import com.adu.tinder.core.utilities.results.Result;
import com.adu.tinder.entities.concretes.MailVerification;

import java.util.List;

public interface MailVerificationManager {
    Result add(MailVerification mailVerification);
    Result delete(MailVerification mailVerification);
    Result update(MailVerification mailVerification);
    DataResult<List<MailVerification>> getAll();
    DataResult<List<MailVerification>> getAllById(int id);
    DataResult<List<MailVerification>> getAllByCode(String code);
    DataResult<List<MailVerification>> getAllByUserId(int id);
    DataResult<List<MailVerification>> getAllByApproved(boolean approved);
}
