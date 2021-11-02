package com.adu.tinder.api.controllers;

import com.adu.tinder.business.abstracts.UserAnswerService;
import com.adu.tinder.core.utilities.results.DataResult;
import com.adu.tinder.core.utilities.results.Result;
import com.adu.tinder.entities.concretes.UserAnswer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/userAnswer")
@CrossOrigin
public class UserAnswersController {
    @Autowired
    private UserAnswerService userAnswerService;
    @GetMapping("/getAllByUserId")
    DataResult<List<UserAnswer>> getByUserId(int id){
        return this.userAnswerService.getByUserId(id);
    }
    @GetMapping("/getAllByAnswerId")
    DataResult<List<UserAnswer>> getByAnswer(int answer){
        return this.userAnswerService.getByAnswer(answer);
    }
    @GetMapping("/getAllById")
    DataResult<List<UserAnswer>> getById(int id){
        return  this.userAnswerService.getById(id);
    }
    @GetMapping("/getAll")
    DataResult<List<UserAnswer>> getAll(){
        return this.userAnswerService.getAll();
    }
    @PostMapping("/add")
    Result add(UserAnswer userAnswer){
        return this.userAnswerService.add(userAnswer);
    }
    @PostMapping("/update")
    Result update(UserAnswer userAnswer,int id){
        return this.userAnswerService.update(userAnswer,id);
    }
    @DeleteMapping("/delete")
    Result delete(int id){
        return this.userAnswerService.delete(id);
    }
}
