package com.adu.tinder.business.concretes;

import com.adu.tinder.business.abstracts.DeveloporService;
import com.adu.tinder.core.utilities.results.DataResult;
import com.adu.tinder.core.utilities.results.Result;
import com.adu.tinder.core.utilities.results.SuccessDataResult;
import com.adu.tinder.core.utilities.results.SuccessResult;
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
        return new SuccessDataResult<List<Developer>>(this.developerDao.findAll(),"Listeleme Başarılı");
    }

    @Override
    public DataResult<List<Developer>> getAllById(int id) {
        return new SuccessDataResult<List<Developer>>(this.developerDao.getById(id),"Listeleme Başarılı");
    }

    @Override
    public Result add(Developer developer) {
        this.developerDao.save(developer);
        return new SuccessResult("Ekleme Başarılı");
    }

    @Override
    public Result delete(int id) {
        this.developerDao.deleteById(id);
        return new SuccessResult("Silme Başarılı");
    }

    @Override
    public Result update(Developer developer, int id) {
        Developer updatedDeveloper = this.developerDao.getById(id).get(0);
        updatedDeveloper.setMail(developer.getMail());
        updatedDeveloper.setPassword(developer.getPassword());
        updatedDeveloper.setPhoneNumber(developer.getPhoneNumber());
        this.developerDao.save(updatedDeveloper);
        return new SuccessResult("Ekleme Başarılı");
    }
}
