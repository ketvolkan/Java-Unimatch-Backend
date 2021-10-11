package com.adu.tinder.business.concretes;

import com.adu.tinder.core.utilities.results.DataResult;
import com.adu.tinder.core.utilities.results.Result;
import com.adu.tinder.dataAccess.abstracts.BlockedDao;
import com.adu.tinder.entities.concretes.Blocked;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlockedManager implements com.adu.tinder.business.abstracts.BlockedManager {
    BlockedDao blockedDao;
    @Autowired
    BlockedManager(BlockedDao blockedDao){
        this.blockedDao=blockedDao;
    }

    @Override
    public DataResult<List<Blocked>> getAll() {
        return null;
    }

    @Override
    public DataResult<List<Blocked>> getAllByBlockedId(int id) {
        return null;
    }

    @Override
    public DataResult<List<Blocked>> getAllByBlockingId(int id) {
        return null;
    }

    @Override
    public Result add(Blocked blocked) {
        return null;
    }

    @Override
    public Result changeActivity(int id) {
        return null;
    }
}
