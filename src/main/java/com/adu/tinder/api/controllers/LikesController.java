package com.adu.tinder.api.controllers;

import com.adu.tinder.business.abstracts.LikeService;
import com.adu.tinder.core.utilities.results.DataResult;
import com.adu.tinder.core.utilities.results.Result;
import com.adu.tinder.entities.concretes.Like;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/like")
@CrossOrigin
public class LikesController {
    @Autowired
    private LikeService likeService;
    @GetMapping("/getAll")
    DataResult<List<Like>> getAll(){return this.likeService.getAll();}
    @GetMapping("/getAllByLikesId")
    DataResult<List<Like>> getAllByLikesId(int id){return this.likeService.getAllByLikesId(id);}
    @GetMapping("/getAllByPopularId")
    DataResult<List<Like>> getAllByPopularId(int id){return this.likeService.getAllByPopularId(id);}
    @GetMapping("/getAllById")
    DataResult<List<Like>> getAllById(int id){return this.likeService.getAllById(id);}
    @PostMapping("/add")
    Result add(@RequestBody Like like){ return this.likeService.add(like);}
    @DeleteMapping("/delete")
    Result delete(int id){return this.likeService.delete(id);}
    @PostMapping("/update")
    Result update(Like like,int id){return this.likeService.update(like,id);}
}
