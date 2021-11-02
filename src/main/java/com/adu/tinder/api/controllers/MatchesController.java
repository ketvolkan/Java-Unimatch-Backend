package com.adu.tinder.api.controllers;

import com.adu.tinder.business.abstracts.MatchService;
import com.adu.tinder.core.utilities.results.DataResult;
import com.adu.tinder.core.utilities.results.Result;
import com.adu.tinder.entities.concretes.Match;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/match")
@CrossOrigin
public class MatchesController {
    @Autowired
    private MatchService matchService;
    @GetMapping("/getAll")
    DataResult<List<Match>> getAll(){return this.matchService.getAll();}
    @GetMapping("/getAllByUserId1")
    DataResult<List<Match>> getAllByUserId1(int id){return this.matchService.getAllByUserId1(id);}
    @GetMapping("/getAllByUserId2")
    DataResult<List<Match>> getAllByUserId2(int id){return this.matchService.getAllByUserId2(id);}
    @GetMapping("/getAllByActive")
    DataResult<List<Match>> getAllByActive(boolean active){return this.matchService.getAllByActive(active);}
    @PostMapping("/add")
    Result add(Match match){return this.matchService.add(match);}
    @DeleteMapping("/delete")
    Result delete(int id){return this.matchService.delete(id);}
    @PostMapping("/update")
    Result update(Match match,int id){return this.matchService.update(match,id);}
    @PostMapping("/changeActivity")
    Result changeActivity(int id){return this.matchService.changeActivity(id);}
}
