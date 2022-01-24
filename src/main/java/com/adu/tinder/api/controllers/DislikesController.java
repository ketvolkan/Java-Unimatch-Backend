package com.adu.tinder.api.controllers;

import com.adu.tinder.business.abstracts.DislikeService;
import com.adu.tinder.core.utilities.results.DataResult;
import com.adu.tinder.core.utilities.results.Result;
import com.adu.tinder.entities.concretes.Dislike;
import com.adu.tinder.entities.concretes.Like;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/dislike")
@CrossOrigin
public class DislikesController {
    @Autowired
    private DislikeService dislikeService;
    @GetMapping("/getAll")
    DataResult<List<Dislike>> getAll(){return this.dislikeService.getAll();}
    @GetMapping("/getAllByDislikesId")
    DataResult<List<Dislike>> getAllByLikesId(int id){return this.dislikeService.getAllByDislikeId(id);}
    @GetMapping("/getAllByOutOfFavorId")
    DataResult<List<Dislike>> getAllByPopularId(int id){return this.dislikeService.getAllByOutOfFavorId(id);}
    @GetMapping("/getAllById")
    DataResult<List<Dislike>> getAllById(int id){return this.dislikeService.getAllById(id);}
    @PostMapping("/add")
    Result add(@RequestBody Dislike dislike){return this.dislikeService.add(dislike);}
    @DeleteMapping("/delete")
    Result delete(int id){return this.dislikeService.delete(id);}
    @PostMapping("/update")
    Result update(Dislike dislike,int id){return this.dislikeService.update(dislike,id);}
}
