package com.adu.tinder.business.concretes;

import com.adu.tinder.business.abstracts.LikeService;
import com.adu.tinder.core.utilities.results.DataResult;
import com.adu.tinder.core.utilities.results.Result;
import com.adu.tinder.core.utilities.results.SuccessDataResult;
import com.adu.tinder.core.utilities.results.SuccessResult;
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
        return new SuccessDataResult<List<Like>>(this.likeDao.findAll(),"Listeleme Başarılı");
    }

    @Override
    public DataResult<List<Like>> getAllByLikesId(int id) {
        return new SuccessDataResult<List<Like>>(this.likeDao.getByLikesId(id),"Listeleme Başarılı");
    }

    @Override
    public DataResult<List<Like>> getAllByPopularId(int id) {
        return new SuccessDataResult<List<Like>>(this.likeDao.getByPopularId(id),"Listeleme Başarılı");
    }

    @Override
    public DataResult<List<Like>> getAllById(int id) {
        return new SuccessDataResult<List<Like>>(this.likeDao.getById(id),"Listeleme Başarılı");
    }

    @Override
    public Result add(Like like) {
        this.likeDao.save(like);
        return new SuccessResult("Ekleme Başarılı");
    }

    @Override
    public Result delete(int id) {
        this.likeDao.deleteById(id);
        return new SuccessResult("Silme Başarılı");
    }

    @Override
    public Result update(Like like, int id) {
        Like updatedLike = this.likeDao.getById(id).get(0);
        updatedLike.setLikesId(like.getLikesId());
        updatedLike.setPopularId(like.getPopularId());
        this.likeDao.save(like);
        return new SuccessResult("Güncelleme Başarılı");
    }
}
