package com.adu.tinder.business.concretes;

import com.adu.tinder.business.abstracts.LikeService;
import com.adu.tinder.core.utilities.results.DataResult;
import com.adu.tinder.core.utilities.results.Result;
import com.adu.tinder.dataAccess.abstracts.LikeDao;
import com.adu.tinder.entities.concretes.Like;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LikeManager implements LikeService {
    private LikeDao likeDao;
    @Autowired
    LikeManager(LikeDao likeDao){
        this.likeDao=likeDao;
    }
    @Override
    public DataResult<List<Like>> getAll() {
        return null;
    }

    @Override
    public DataResult<List<Like>> getAllByLikesId(int id) {
        return null;
    }

    @Override
    public DataResult<List<Like>> getAllByPopularId(int id) {
        return null;
    }

    @Override
    public DataResult<List<Like>> getAllByActive(boolean active) {
        return null;
    }

    @Override
    public Result add(Like like) {
        return null;
    }

    @Override
    public Result delete(Like like) {
        return null;
    }

    @Override
    public Result update(Like like) {
        return null;
    }

    @Override
    public Result changeActivity(int id) {
        return null;
    }
}
