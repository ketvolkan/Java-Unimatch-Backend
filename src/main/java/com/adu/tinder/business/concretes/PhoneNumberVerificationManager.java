package com.adu.tinder.business.concretes;

import com.adu.tinder.core.utilities.results.DataResult;
import com.adu.tinder.core.utilities.results.Result;
import com.adu.tinder.entities.concretes.PhoneNumberVerification;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PhoneNumberVerificationManager implements com.adu.tinder.business.abstracts.PhoneNumberVerificationManager {
    @Override
    public Result add(PhoneNumberVerification phoneNumberVerification) {
        return null;
    }

    @Override
    public Result delete(PhoneNumberVerification phoneNumberVerification) {
        return null;
    }

    @Override
    public Result update(PhoneNumberVerification phoneNumberVerification) {
        return null;
    }

    @Override
    public DataResult<List<PhoneNumberVerification>> getAll() {
        return null;
    }

    @Override
    public DataResult<List<PhoneNumberVerification>> getAllById(int id) {
        return null;
    }

    @Override
    public DataResult<List<PhoneNumberVerification>> getAllByCode(String code) {
        return null;
    }

    @Override
    public DataResult<List<PhoneNumberVerification>> getAllByUserId(int id) {
        return null;
    }

    @Override
    public DataResult<List<PhoneNumberVerification>> getAllByApproved(boolean approved) {
        return null;
    }
}
