package com.adu.tinder.business.abstracts;

import com.adu.tinder.core.utilities.results.DataResult;
import com.adu.tinder.core.utilities.results.Result;

import com.adu.tinder.entities.concretes.PhoneNumberVerification;

import java.util.List;

public interface PhoneNumberVerificationManager {
    Result add(PhoneNumberVerification phoneNumberVerification);
    Result delete(PhoneNumberVerification phoneNumberVerification);
    Result update(PhoneNumberVerification phoneNumberVerification);
    DataResult<List<PhoneNumberVerification>> getAll();
    DataResult<List<PhoneNumberVerification>> getAllById(int id);
    DataResult<List<PhoneNumberVerification>> getAllByCode(String code);
    DataResult<List<PhoneNumberVerification>> getAllByUserId(int id);
    DataResult<List<PhoneNumberVerification>> getAllByApproved(boolean approved);
}
