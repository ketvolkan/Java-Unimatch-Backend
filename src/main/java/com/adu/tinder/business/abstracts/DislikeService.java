package com.adu.tinder.business.abstracts;

import com.adu.tinder.core.utilities.results.DataResult;
import com.adu.tinder.core.utilities.results.Result;

import com.adu.tinder.entities.concretes.Dislike;


import java.util.List;

public interface DislikeService {
    DataResult<List<Dislike>> getAll();
    DataResult<List<Dislike>> getAllByDislikeId(int id);
    DataResult<List<Dislike>> getAllByOutOfFavorId(int id);
    Result add(Dislike dislike);
    Result delete(Dislike dislike);
    Result update(Dislike dislike);
}
