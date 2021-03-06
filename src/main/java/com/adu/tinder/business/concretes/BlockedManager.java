package com.adu.tinder.business.concretes;

import com.adu.tinder.business.abstracts.BlockedService;
import com.adu.tinder.core.utilities.results.DataResult;
import com.adu.tinder.core.utilities.results.Result;
import com.adu.tinder.core.utilities.results.SuccessDataResult;
import com.adu.tinder.core.utilities.results.SuccessResult;
import com.adu.tinder.dataAccess.abstracts.BlockedDao;
import com.adu.tinder.entities.concretes.Blocked;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlockedManager implements BlockedService {
    BlockedDao blockedDao;
    @Autowired
    BlockedManager(BlockedDao blockedDao){
        this.blockedDao=blockedDao;
    }

    @Override
    public DataResult<List<Blocked>> getAll() {
        return new SuccessDataResult<List<Blocked>>(this.blockedDao.findAll(),"Listeleme Başarılı");
    }

    @Override
    public DataResult<List<Blocked>> getAllById(int id) {
        return new SuccessDataResult<List<Blocked>>(this.blockedDao.getById(id),"Listeleme Başarılı");
    }

    @Override
    public DataResult<List<Blocked>> getAllByBlockedId(int id) {
        return new SuccessDataResult<List<Blocked>>(this.blockedDao.getByBlockedId(id),"Listeleme Başarılı");
    }

    @Override
    public DataResult<List<Blocked>> getAllByBlockingId(int id) {
        return new SuccessDataResult<List<Blocked>>(this.blockedDao.getByBlockingId(id),"Listeleme Başarılı");
    }

    @Override
    public DataResult<List<Blocked>> getAllByActive(boolean active) {
        return new SuccessDataResult<List<Blocked>>(this.blockedDao.getByActive(active),"Listeleme Başarılı");
    }

    @Override
    public Result add(Blocked blocked) {
        this.blockedDao.save(blocked);
        return new SuccessResult("Ekleme Başarılı");
    }

    @Override
    public Result delete(int id) {
        this.blockedDao.deleteById(id);
        return new SuccessResult("Silme Başarılı");
    }

    @Override
    public Result update(Blocked blocked, int id) {
        Blocked updatedBlocked = this.blockedDao.getById(id).get(0);
        updatedBlocked.setBlockedId(blocked.getBlockedId());
        updatedBlocked.setBlockingId(blocked.getBlockingId());
        updatedBlocked.setActive(blocked.isActive());
        this.blockedDao.save(updatedBlocked);
        return new SuccessResult("Güncelleme Başarılı");
    }

    @Override
    public Result changeActivity(int id) {
        this.blockedDao.setActive(id);
        return new SuccessResult("Activity Değiştirme Başarılı");
    }
}
