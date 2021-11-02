package com.adu.tinder.api.controllers;

import com.adu.tinder.business.abstracts.DeveloporService;
import com.adu.tinder.core.utilities.results.DataResult;
import com.adu.tinder.core.utilities.results.Result;
import com.adu.tinder.entities.concretes.Developer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/developer")
@CrossOrigin
public class DevelopersController {
    @Autowired
    private DeveloporService developorService;
    @GetMapping("/getAll")
    DataResult<List<Developer>> getAll(){return this.developorService.getAll();}
    @GetMapping("/getAllById")
    DataResult<List<Developer>> getAllById(int id){return this.developorService.getAllById(id);}
    @PostMapping("/add")
    Result add(Developer developer){return this.developorService.add(developer);}
    @DeleteMapping("/delete")
    Result delete(int id){return this.developorService.delete(id);}
    @PostMapping("/update")
    Result update(Developer developer,int id){return this.developorService.update(developer,id);}
}
