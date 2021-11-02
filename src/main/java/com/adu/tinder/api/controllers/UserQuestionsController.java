package com.adu.tinder.api.controllers;

import com.adu.tinder.business.abstracts.UserQuestionService;
import com.adu.tinder.business.concretes.UserManager;
import com.adu.tinder.business.concretes.UserQuestionManager;
import com.adu.tinder.core.utilities.results.DataResult;
import com.adu.tinder.core.utilities.results.Result;
import com.adu.tinder.entities.concretes.UserQuestion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/userQuestion")
@CrossOrigin
public class UserQuestionsController {
    @Autowired
    private UserQuestionService userQuestionService;

    @GetMapping("/getAll")
    public DataResult<List<UserQuestion>> getAll()
    {
        return this.userQuestionService.getAll();
    }
    @GetMapping("/getById")
    public DataResult<List<UserQuestion>> getById(int id) {return this.userQuestionService.getById(id);}
    @PostMapping("/add")
    public Result add(@RequestBody UserQuestion userQuestion) {
        return this.userQuestionService.add(userQuestion);
    }
    @PostMapping("/update")
    public Result update(@RequestBody UserQuestion userQuestion,int id) {
        return this.userQuestionService.update(userQuestion,id);
    }
    @DeleteMapping("/delete")
    public Result delete(int id) {
        return this.userQuestionService.delete(id);
    }
}
