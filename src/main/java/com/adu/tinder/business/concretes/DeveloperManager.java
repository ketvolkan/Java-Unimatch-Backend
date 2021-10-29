package com.adu.tinder.business.concretes;

import com.adu.tinder.business.abstracts.DeveloporService;
import com.adu.tinder.core.utilities.results.DataResult;
import com.adu.tinder.core.utilities.results.Result;
import com.adu.tinder.dataAccess.abstracts.DeveloperDao;
import com.adu.tinder.entities.concretes.Developer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeveloperManager implements DeveloporService {
    private DeveloperDao developerDao;
    @Autowired
    DeveloperManager(DeveloperDao developerDao){
        this.developerDao = developerDao;
    }
    @Override
    public DataResult<List<Developer>> getAll() {
        return null;
    }

    @Override
    public DataResult<List<Developer>> getAllById(int id) {
        return null;
    }

    @Override
    public Result add(Developer developer) {
        return null;
    }

    @Override
    public Result delete(Developer developer) {
        return null;
    }

    @Override
    public Result update(Developer developer) {
        return null;
    }
}
