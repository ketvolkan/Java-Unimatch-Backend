package com.adu.tinder.business.concretes;

import com.adu.tinder.business.abstracts.MailVerificationService;
import com.adu.tinder.core.utilities.results.DataResult;
import com.adu.tinder.core.utilities.results.Result;
import com.adu.tinder.dataAccess.abstracts.MailVerificationDao;
import com.adu.tinder.entities.concretes.MailVerification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MailVerificationManager implements MailVerificationService {
    private MailVerificationDao mailVerificationDao;
    @Autowired
    MailVerificationManager(MailVerificationDao mailVerificationDao){
        this.mailVerificationDao=mailVerificationDao;
    }
    @Override
    public Result add(MailVerification mailVerification) {
        return null;
    }

    @Override
    public Result delete(MailVerification mailVerification) {
        return null;
    }

    @Override
    public Result update(MailVerification mailVerification) {
        return null;
    }

    @Override
    public DataResult<List<MailVerification>> getAll() {
        return null;
    }

    @Override
    public DataResult<List<MailVerification>> getAllById(int id) {
        return null;
    }

    @Override
    public DataResult<List<MailVerification>> getAllByCode(String code) {
        return null;
    }

    @Override
    public DataResult<List<MailVerification>> getAllByUserId(int id) {
        return null;
    }

    @Override
    public DataResult<List<MailVerification>> getAllByApproved(boolean approved) {
        return null;
    }
}
