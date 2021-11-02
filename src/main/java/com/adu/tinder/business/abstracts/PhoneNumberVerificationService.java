package com.adu.tinder.business.abstracts;

import com.adu.tinder.core.utilities.results.DataResult;
import com.adu.tinder.core.utilities.results.Result;

import com.adu.tinder.entities.concretes.PhoneNumberVerification;

import java.util.List;

public interface PhoneNumberVerificationService {
    Result add(PhoneNumberVerification phoneNumberVerification);
    Result delete(int id);
    Result update(PhoneNumberVerification phoneNumberVerification,int id);
    DataResult<List<PhoneNumberVerification>> getAll();
    DataResult<List<PhoneNumberVerification>> getAllById(int id);
    DataResult<List<PhoneNumberVerification>> getAllByCode(String code);
    DataResult<List<PhoneNumberVerification>> getAllByUserId(int id);
    DataResult<List<PhoneNumberVerification>> getAllByApproved(boolean approved);
}
