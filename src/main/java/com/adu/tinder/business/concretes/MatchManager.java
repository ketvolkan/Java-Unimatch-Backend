package com.adu.tinder.business.concretes;

import com.adu.tinder.business.abstracts.MatchService;
import com.adu.tinder.core.utilities.results.DataResult;
import com.adu.tinder.core.utilities.results.Result;
import com.adu.tinder.core.utilities.results.SuccessDataResult;
import com.adu.tinder.core.utilities.results.SuccessResult;
import com.adu.tinder.dataAccess.abstracts.MatchDao;
import com.adu.tinder.entities.concretes.Match;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MatchManager implements MatchService {

    private MatchDao matchDao;
    @Autowired
    MatchManager(MatchDao matchDao){
        this.matchDao = matchDao;
    }
    @Override
    public DataResult<List<Match>> getAll() {
        return new SuccessDataResult<List<Match>>(this.matchDao.findAll(),"Listeleme Başarılı");
    }

    @Override
    public DataResult<List<Match>> getAllByUserId1(int id) {
        return new SuccessDataResult<List<Match>>(this.matchDao.getByUserId1(id),"Listeleme Başarılı");
    }

    @Override
    public DataResult<List<Match>> getAllByUserId2(int id) {
        return new SuccessDataResult<List<Match>>(this.matchDao.getByUserId2(id),"Listeleme Başarılı");
    }

    @Override
    public DataResult<List<Match>> getAllByActive(boolean active) {
        return new SuccessDataResult<List<Match>>(this.matchDao.getByActive(active),"Listeleme Başarılı");
    }

    @Override
    public Result add(Match match) {
        this.matchDao.save(match);
        return new SuccessResult("Ekleme Başarılı");
    }

    @Override
    public Result delete(int id) {
        this.matchDao.deleteById(id);
        return new SuccessResult("Silme Başarılı");
    }

    @Override
    public Result update(Match match, int id) {
        Match updatedMatch = this.matchDao.getById(id).get(0);
        updatedMatch.setUserId1(match.getUserId1());
        updatedMatch.setUserId2(match.getUserId2());
        this.matchDao.save(updatedMatch);
        return new SuccessResult("Güncelleme Başarılı");
    }

    @Override
    public Result changeActivity(int id) {
        this.matchDao.setActive(id);
        return new SuccessResult("Activity Değiştirme Başarılı");
    }
}
