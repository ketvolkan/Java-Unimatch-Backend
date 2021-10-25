package com.adu.tinder.business.concretes;

import com.adu.tinder.core.utilities.results.DataResult;
import com.adu.tinder.core.utilities.results.Result;
import com.adu.tinder.entities.concretes.Dislike;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DislikeManager implements com.adu.tinder.business.abstracts.DislikeManager {
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
