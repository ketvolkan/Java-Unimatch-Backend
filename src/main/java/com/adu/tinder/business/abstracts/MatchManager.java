package com.adu.tinder.business.abstracts;

import com.adu.tinder.core.utilities.results.DataResult;
import com.adu.tinder.core.utilities.results.Result;

import com.adu.tinder.entities.concretes.Match;

import java.util.List;

public interface MatchManager {
    DataResult<List<Match>> getAll();
    DataResult<List<Match>> getAllByUserId1(int id);
    DataResult<List<Match>> getAllByUserId2(int id);
    DataResult<List<Match>> getAllByActive(boolean active);
    Result add(Match match);
    Result delete(Match match);
    Result update(Match match);
    Result changeActivity(int id);

}
