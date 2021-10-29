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

    @GetMapping("/getall")
    public DataResult<List<User>> getAll()
    {
        return this.userManager.getAll();
    }
    @GetMapping("/getById")
    public DataResult<List<User>> getById(int id)
    {
        return this.userManager.getById(id);
    }
    @PostMapping("/add")
    public Result add(@RequestBody User user) {
        return this.userManager.add(user);
    }
}
