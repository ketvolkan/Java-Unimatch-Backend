package com.adu.tinder.business.concretes;

import com.adu.tinder.business.abstracts.DislikeService;
import com.adu.tinder.core.utilities.results.DataResult;
import com.adu.tinder.core.utilities.results.Result;
import com.adu.tinder.core.utilities.results.SuccessDataResult;
import com.adu.tinder.core.utilities.results.SuccessResult;
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
        return new SuccessDataResult<List<Dislike>>(this.dislikeDao.findAll(),"Listeleme Başarılı");
    }

    @Override
    public DataResult<List<Dislike>> getAllByDislikeId(int id) {
        return new SuccessDataResult<List<Dislike>>(this.dislikeDao.getByDislikeId(id),"Listeleme Başarılı");
    }

    @Override
    public DataResult<List<Dislike>> getAllByOutOfFavorId(int id) {
        return new SuccessDataResult<List<Dislike>>(this.dislikeDao.getByOutOfFavorId(id),"Listeleme Başarılı");
    }

    @Override
    public DataResult<List<Dislike>> getAllById(int id) {
        return new SuccessDataResult<List<Dislike>>(this.dislikeDao.getById(id),"Listeleme Başarılı");
    }

    @Override
    public Result add(Dislike dislike) {
        this.dislikeDao.save(dislike);
        return new SuccessResult("Ekleme Başarılı");
    }

    @Override
    public Result delete(int id) {
        this.dislikeDao.deleteById(id);
        return new SuccessResult("Silme Başarılı");
    }

    @Override
    public Result update(Dislike dislike, int id) {
        Dislike updatedDislike = this.dislikeDao.getById(id).get(0);
        updatedDislike.setDislikeId(dislike.getDislikeId());
        updatedDislike.setOutOfFavorId(dislike.getOutOfFavorId());
        this.dislikeDao.save(updatedDislike);
        return new SuccessResult("Güncelleme Başarılı");
    }
}
