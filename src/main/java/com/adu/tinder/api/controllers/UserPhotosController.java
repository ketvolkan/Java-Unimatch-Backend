package com.adu.tinder.api.controllers;

import com.adu.tinder.business.abstracts.UserPhotoService;
import com.adu.tinder.business.concretes.UserPhotoManager;
import com.adu.tinder.core.utilities.results.DataResult;
import com.adu.tinder.core.utilities.results.Result;
import com.adu.tinder.entities.concretes.UserPhoto;
import com.adu.tinder.entities.concretes.UserQuestion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/userPhoto")
@CrossOrigin
public class UserPhotosController {
    @Autowired
    private UserPhotoService userPhotoService;

    @GetMapping("/getAll")
    public DataResult<List<UserPhoto>> getAll()
    {
        return this.userPhotoService.getAll();
    }
    @GetMapping("/getByUserId")
    public DataResult<List<UserPhoto>> getUserById(int id) {return this.userPhotoService.getAllByUserId(id);}
    @GetMapping("/getById")
    public DataResult<List<UserPhoto>> getById(int id) {return this.userPhotoService.getAllById(id);}
    @GetMapping("/getByPhotoUrl")
    public DataResult<List<UserPhoto>> getByPhotoUrl(String photoUrl) {return this.userPhotoService.getAllByPhotoUrl(photoUrl);}
    @GetMapping("/getByActive")
    public DataResult<List<UserPhoto>> getByActive(boolean control) {return this.userPhotoService.getAllByActive(control);}

    @PostMapping("/add")
    public Result add(@RequestBody UserPhoto userPhoto) {
        return this.userPhotoService.add(userPhoto);
    }
    @PostMapping("/update")
    public Result update(@RequestBody UserPhoto userPhoto,int id) {
        return this.userPhotoService.update(userPhoto,id);
    }
    @DeleteMapping("/delete")
    public Result delete(int id) {
        return this.userPhotoService.delete(id);
    }

}
