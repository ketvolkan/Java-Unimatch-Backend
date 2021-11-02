package com.adu.tinder.api.controllers;

import com.adu.tinder.business.abstracts.BlockedService;
import com.adu.tinder.core.utilities.results.DataResult;
import com.adu.tinder.core.utilities.results.Result;
import com.adu.tinder.entities.concretes.Blocked;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/blocked")
@CrossOrigin
public class BlockedsController {
    @Autowired
    private BlockedService blockedService;
    @GetMapping("/getAll")
    DataResult<List<Blocked>> getAll(){return this.blockedService.getAll();}
    @GetMapping("/getAllById")
    DataResult<List<Blocked>> getAllById(int id){return this.blockedService.getAllById(id);}
    @GetMapping("/getAllByBlockedId")
    DataResult<List<Blocked>> getAllByBlockedId(int id){return this.blockedService.getAllByBlockedId(id);}
    @GetMapping("/getAllByBlockingId")
    DataResult<List<Blocked>> getAllByBlockingId(int id){return this.blockedService.getAllByBlockingId(id);}
    @GetMapping("/getAllByActive")
    DataResult<List<Blocked>> getAllByActive(boolean active){return this.blockedService.getAllByActive(active);}
    @PostMapping("/add")
    Result add(Blocked blocked){return this.blockedService.add(blocked);}
    @DeleteMapping("/delete")
    Result delete(int id){return this.blockedService.delete(id);}
    @PostMapping("/update")
    Result update(Blocked blocked,int id){return this.blockedService.update(blocked,id);}
    @PostMapping("/changeActivity")
    Result changeActivity(int id){return this.blockedService.changeActivity(id);}
}
