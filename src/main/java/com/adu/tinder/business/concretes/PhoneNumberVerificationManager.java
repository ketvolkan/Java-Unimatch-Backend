package com.adu.tinder.business.concretes;

import com.adu.tinder.business.abstracts.PhoneNumberVerificationService;
import com.adu.tinder.core.utilities.results.DataResult;
import com.adu.tinder.core.utilities.results.Result;
import com.adu.tinder.core.utilities.results.SuccessDataResult;
import com.adu.tinder.core.utilities.results.SuccessResult;
import com.adu.tinder.dataAccess.abstracts.PhoneNumberVerificationDao;
import com.adu.tinder.entities.concretes.PhoneNumberVerification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PhoneNumberVerificationManager implements PhoneNumberVerificationService {
    private PhoneNumberVerificationDao phoneNumberVerificationDao;
    @Autowired
    PhoneNumberVerificationManager(PhoneNumberVerificationDao phoneNumberVerificationDao){
        this.phoneNumberVerificationDao=phoneNumberVerificationDao;

    }
    @Override
    public Result add(PhoneNumberVerification phoneNumberVerification) {
        this.phoneNumberVerificationDao.save(phoneNumberVerification);
        return new SuccessResult("Ekleme Başarılı");
    }

    @Override
    public Result delete(int id) {
        this.phoneNumberVerificationDao.deleteById(id);
        return new SuccessResult("Silme Başarılı");
    }

    @Override
    public Result update(PhoneNumberVerification phoneNumberVerification, int id) {
        PhoneNumberVerification updatedPhoneNumberVerification = this.phoneNumberVerificationDao.getById(id).get(0);
        updatedPhoneNumberVerification.setCode(phoneNumberVerification.getCode());
        this.phoneNumberVerificationDao.save(updatedPhoneNumberVerification);
        return new SuccessResult("Güncelleme Başarılı");
    }
 @Override
    public DataResult<List<PhoneNumberVerification>> getAll() {
        return new SuccessDataResult<List<PhoneNumberVerification>>(this.phoneNumberVerificationDao.findAll(),"Listeleme Başarılı");
    }

    @Override
    public DataResult<List<PhoneNumberVerification>> getAllById(int id) {
        return new SuccessDataResult<List<PhoneNumberVerification>>(this.phoneNumberVerificationDao.getById(id),"Listeleme Başarılı");
    }

    @Override
    public DataResult<List<PhoneNumberVerification>> getAllByCode(String code) {
        return new SuccessDataResult<List<PhoneNumberVerification>>(this.phoneNumberVerificationDao.getByCode(code),"Listeleme Başarılı");
    }

    @Override
    public DataResult<List<PhoneNumberVerification>> getAllByUserId(int id) {
        return new SuccessDataResult<List<PhoneNumberVerification>>(this.phoneNumberVerificationDao.getByUserId(id),"Listeleme Başarılı");
    }

    @Override
    public DataResult<List<PhoneNumberVerification>> getAllByApproved(boolean approved) {
        return new SuccessDataResult<List<PhoneNumberVerification>>(this.phoneNumberVerificationDao.getByApproved(approved),"Listeleme Başarılı");
    }
}
