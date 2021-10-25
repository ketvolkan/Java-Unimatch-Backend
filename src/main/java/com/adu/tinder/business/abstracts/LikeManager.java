package com.adu.tinder.business.abstracts;

import com.adu.tinder.core.utilities.results.DataResult;
import com.adu.tinder.core.utilities.results.Result;

import com.adu.tinder.entities.concretes.Like;


import java.util.List;

public interface LikeManager {
    DataResult<List<Like>> getAll();
    DataResult<List<Like>> getAllByLikesId(int id);
    DataResult<List<Like>> getAllByPopularId(int id);
    DataResult<List<Like>> getAllByActive(boolean active);
    Result add(Like like);
    Result delete(Like like);
    Result update(Like like);
    Result changeActivity(int id);
}
