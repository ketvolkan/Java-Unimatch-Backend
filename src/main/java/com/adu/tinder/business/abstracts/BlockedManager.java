package com.adu.tinder.business.abstracts;

import com.adu.tinder.core.utilities.results.DataResult;
import com.adu.tinder.core.utilities.results.Result;
import com.adu.tinder.entities.concretes.Blocked;

import java.util.List;

public interface BlockedManager {
    DataResult<List<Blocked>> getAll();
    DataResult<List<Blocked>> getAllByBlockedId(int id);
    DataResult<List<Blocked>> getAllByBlockingId(int id);
    Result add(Blocked blocked);
    Result changeActivity(int id);
}
