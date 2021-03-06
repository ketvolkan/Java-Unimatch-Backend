package com.adu.tinder.business.abstracts;

import com.adu.tinder.core.utilities.results.DataResult;
import com.adu.tinder.core.utilities.results.Result;

import com.adu.tinder.entities.concretes.Like;


import javax.xml.crypto.Data;
import java.util.List;

public interface LikeService {
    DataResult<List<Like>> getAll();
    DataResult<List<Like>> getAllByLikesId(int id);
    DataResult<List<Like>> getAllByPopularId(int id);
    DataResult<List<Like>> getAllById(int id);
    Result add(Like like);
    Result delete(int id);
    Result update(Like like,int id);
}
