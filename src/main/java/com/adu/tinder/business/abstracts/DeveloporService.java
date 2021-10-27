package com.adu.tinder.business.abstracts;

import com.adu.tinder.core.utilities.results.DataResult;
import com.adu.tinder.core.utilities.results.Result;
import com.adu.tinder.entities.concretes.Developer;


import java.util.List;

public interface DeveloporService {
    DataResult<List<Developer>> getAll();
    DataResult<List<Developer>> getAllById(int id);
    Result add(Developer developer);
    Result delete(Developer developer);
    Result update(Developer developer);

}
