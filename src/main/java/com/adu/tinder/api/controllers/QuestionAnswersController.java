package com.adu.tinder.api.controllers;

import com.adu.tinder.business.abstracts.QuestionAnswerService;
import com.adu.tinder.core.utilities.results.DataResult;
import com.adu.tinder.core.utilities.results.Result;
import com.adu.tinder.entities.concretes.QuestionAnswer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/questionAnswer")
@CrossOrigin
public class QuestionAnswersController {
@Autowired
private QuestionAnswerService questionAnswerService;
    @GetMapping("/getAll")
    DataResult<List<QuestionAnswer>> getAll(){
        return this.questionAnswerService.getAll();
    }
    @GetMapping("/getAllByQuestionId")
    DataResult<List<QuestionAnswer>> getByQuestionId(int id){
        return this.questionAnswerService.getByQuestionId(id);
    }
    @GetMapping("/getAllById")
    DataResult<List<QuestionAnswer>> getById(int id){
        return this.questionAnswerService.getById(id);
    }
    @PostMapping("/add")
    Result add(QuestionAnswer questionAnswer){
        return this.questionAnswerService.add(questionAnswer);
    }
    @DeleteMapping("/delete")
    Result delete(int id){
        return this.questionAnswerService.delete(id);
    }
    @PostMapping("/update")
    Result update(QuestionAnswer questionAnswer,int id){
        return this.questionAnswerService.update(questionAnswer,id);
    }
}
