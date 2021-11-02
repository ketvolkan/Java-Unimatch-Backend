package com.adu.tinder.business.concretes;

import com.adu.tinder.business.abstracts.MailVerificationService;
import com.adu.tinder.core.utilities.results.DataResult;
import com.adu.tinder.core.utilities.results.Result;
import com.adu.tinder.core.utilities.results.SuccessDataResult;
import com.adu.tinder.core.utilities.results.SuccessResult;
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
        this.mailVerificationDao.save(mailVerification);
        return new SuccessResult("Ekleme Başarılı");
    }

    @Override
    public Result delete(int id) {
        this.mailVerificationDao.deleteById(id);
        return new SuccessResult("Silme Başarılı");
    }

    @Override
    public Result update(MailVerification mailVerification, int id) {
        MailVerification updatedMailVerification = this.mailVerificationDao.getById(id).get(0);
        updatedMailVerification.setCode(mailVerification.getCode());
        this.mailVerificationDao.save(updatedMailVerification);
        return new SuccessResult("Güncelleme Başarılı");
    }
    @Override
    public DataResult<List<MailVerification>> getAll() {
        return new SuccessDataResult<List<MailVerification>>(this.mailVerificationDao.findAll(),"Listeleme Başarılı");
    }

    @Override
    public DataResult<List<MailVerification>> getAllById(int id) {
        return new SuccessDataResult<List<MailVerification>>(this.mailVerificationDao.getById(id),"Listeleme Başarılı");
    }

    @Override
    public DataResult<List<MailVerification>> getAllByCode(String code) {
        return new SuccessDataResult<List<MailVerification>>(this.mailVerificationDao.getByCode(code),"Listeleme Başarılı");
    }

    @Override
    public DataResult<List<MailVerification>> getAllByUserId(int id) {
        return new SuccessDataResult<List<MailVerification>>(this.mailVerificationDao.getByUserId(id),"Listeleme Başarılı");
    }

    @Override
    public DataResult<List<MailVerification>> getAllByApproved(boolean approved) {
        return new SuccessDataResult<List<MailVerification>>(this.mailVerificationDao.getByApproved(approved),"Listeleme Başarılı");
    }
}
