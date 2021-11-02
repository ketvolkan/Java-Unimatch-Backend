package com.adu.tinder.api.controllers;

import com.adu.tinder.business.abstracts.PhoneNumberVerificationService;
import com.adu.tinder.core.utilities.results.DataResult;
import com.adu.tinder.core.utilities.results.Result;
import com.adu.tinder.entities.concretes.PhoneNumberVerification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/phoneNumberVerification")
@CrossOrigin
public class PhoneNumberVerificationsController {
    @Autowired
    private PhoneNumberVerificationService phoneNumberVerificationService;
    @PostMapping("/add")
    Result add(PhoneNumberVerification phoneNumberVerification){
       return this.phoneNumberVerificationService.add(phoneNumberVerification);
    }
    @DeleteMapping("/delete")
    Result delete(int id){
        return this.phoneNumberVerificationService.delete(id);
    }
    @PostMapping("/update")
    Result update(PhoneNumberVerification phoneNumberVerification,int id){
       return this.phoneNumberVerificationService.update(phoneNumberVerification,id);
    }
    @GetMapping("/getAll")
    DataResult<List<PhoneNumberVerification>> getAll(){
        return this.phoneNumberVerificationService.getAll();
    }
    @GetMapping("/getAllById")
    DataResult<List<PhoneNumberVerification>> getAllById(int id){
       return this.phoneNumberVerificationService.getAllById(id);
    }
    @GetMapping("/getAllByCode")
    DataResult<List<PhoneNumberVerification>> getAllByCode(String code){
        return this.phoneNumberVerificationService.getAllByCode(code);
    }
    @GetMapping("/getAllByUserId")
    DataResult<List<PhoneNumberVerification>> getAllByUserId(int id){
        return this.phoneNumberVerificationService.getAllByUserId(id);
    }
    @GetMapping("/getAllByApproved")
    DataResult<List<PhoneNumberVerification>> getAllByApproved(boolean approved){
        return this.phoneNumberVerificationService.getAllByApproved(approved);
    }
}
