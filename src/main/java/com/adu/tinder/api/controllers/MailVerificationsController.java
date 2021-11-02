package com.adu.tinder.api.controllers;

import com.adu.tinder.business.abstracts.MailVerificationService;
import com.adu.tinder.core.utilities.results.DataResult;
import com.adu.tinder.core.utilities.results.Result;
import com.adu.tinder.entities.concretes.MailVerification;
import com.adu.tinder.entities.concretes.PhoneNumberVerification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/mailVerification")
@CrossOrigin
public class MailVerificationsController {
    @Autowired
    private MailVerificationService mailVerificationService;
    @PostMapping("/add")
    Result add(MailVerification mailVerification){
        return this.mailVerificationService.add(mailVerification);
    }
    @DeleteMapping("/delete")
    Result delete(int id){
        return this.mailVerificationService.delete(id);
    }
    @PostMapping("/update")
    Result update(MailVerification mailVerification,int id){
        return this.mailVerificationService.update(mailVerification,id);
    }
    @GetMapping("/getAll")
    DataResult<List<MailVerification>> getAll(){
        return this.mailVerificationService.getAll();
    }
    @GetMapping("/getAllById")
    DataResult<List<MailVerification>> getAllById(int id){
        return this.mailVerificationService.getAllById(id);
    }
    @GetMapping("/getAllByCode")
    DataResult<List<MailVerification>> getAllByCode(String code){
        return this.mailVerificationService.getAllByCode(code);
    }
    @GetMapping("/getAllByUserId")
    DataResult<List<MailVerification>> getAllByUserId(int id){
        return this.mailVerificationService.getAllByUserId(id);
    }
    @GetMapping("/getAllByApproved")
    DataResult<List<MailVerification>> getAllByApproved(boolean approved){
        return this.mailVerificationService.getAllByApproved(approved);
    }

}
