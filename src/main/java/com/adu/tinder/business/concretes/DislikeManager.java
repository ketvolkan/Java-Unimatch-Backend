package com.adu.tinder.business.concretes;

import com.adu.tinder.business.abstracts.DislikeService;
import com.adu.tinder.core.utilities.results.DataResult;
import com.adu.tinder.core.utilities.results.Result;
import com.adu.tinder.dataAccess.abstracts.DislikeDao;
import com.adu.tinder.entities.concretes.Dislike;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DislikeManager implements DislikeService {
    private DislikeDao dislikeDao;
    @Autowired
    DislikeManager(DislikeDao dislikeDao){
        this.dislikeDao = dislikeDao;
    }
    @Override
    public DataResult<List<Dislike>> getAll() {
        return null;
    }

    @Override
    public DataResult<List<Dislike>> getAllByDislikeId(int id) {
        return null;
    }

    @Override
    public DataResult<List<Dislike>> getAllByOutOfFavorId(int id) {
        return null;
    }

    @Override
    public DataResult<List<Dislike>> getAllByActive(boolean active) {
        return null;
    }

    @Override
    public Result add(Dislike dislike) {
        return null;
    }

    @Override
    public Result delete(Dislike dislike) {
        return null;
    }

    @Override
    public Result update(Dislike dislike) {
        return null;
    }

    @Override
    public Result changeActivity(int id) {
        return null;
    }
}
