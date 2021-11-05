package com.adu.tinder.api.controllers;

import com.adu.tinder.business.concretes.UserManager;
import com.adu.tinder.core.utilities.results.DataResult;
import com.adu.tinder.core.utilities.results.Result;
import com.adu.tinder.entities.concretes.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user")
@CrossOrigin
public class UsersController {
    @Autowired
    private UserManager userManager;

    @GetMapping("/getAll")
    public DataResult<List<User>> getAll()
    {
        return this.userManager.getAll();
    }
    @GetMapping("/getAllByGender")
    public DataResult<List<User>> getAllByGender(char gender) {return this.userManager.getByGender(gender);}
    @GetMapping("/getAllByVerifiedAccount")
    public DataResult<List<User>> getAllByVerifiedAccount(boolean verifiedAccount) {return this.userManager.getByVerifiedAccount(verifiedAccount);}
    @GetMapping("/getAllByMail")
    public DataResult<List<User>> getAllByMail(String mail)
    {
        return this.userManager.getByMail(mail);
    }
    @GetMapping("/getAllByActive")
    public DataResult<List<User>> getAllByActive(boolean active)
    {
        return this.userManager.getByActive(active);
    }
    @GetMapping("/getAllPhoneNumber")
    public DataResult<List<User>> getAllByPhoneNumber(String phoneNumber) {return this.userManager.getByPhoneNumber(phoneNumber);}
    @GetMapping("/getById")
    public DataResult<List<User>> getById(int id) {return this.userManager.getById(id);}
    @PostMapping("/add")
    public Result add(@RequestBody User user) {
        return this.userManager.add(user);
    }
    @PostMapping("/update")
    public Result update(@RequestBody User user,int id) {
        return this.userManager.update(user,id);
    }
    @PostMapping("/setActive")
    public Result setActive(@RequestBody int id,boolean control) {
        return this.userManager.setActive(id,control);
    }
    @PostMapping("/setVerified")
    public Result setVerified(@RequestBody int id,boolean control) {
        return this.userManager.setVerified(id,control);
    }
    @DeleteMapping("/delete")
    public Result delete(int id) {
        return this.userManager.delete(id);
    }
}
