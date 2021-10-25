package com.adu.tinder.business.concretes;

import com.adu.tinder.core.utilities.results.DataResult;
import com.adu.tinder.core.utilities.results.Result;
import com.adu.tinder.entities.concretes.Match;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MatchManager implements com.adu.tinder.business.abstracts.MatchManager {
    @Override
    public DataResult<List<Match>> getAll() {
        return null;
    }

    @Override
    public DataResult<List<Match>> getAllByUserId1(int id) {
        return null;
    }

    @Override
    public DataResult<List<Match>> getAllByUserId2(int id) {
        return null;
    }

    @Override
    public DataResult<List<Match>> getAllByActive(boolean active) {
        return null;
    }

    @Override
    public Result add(Match match) {
        return null;
    }

    @Override
    public Result delete(Match match) {
        return null;
    }

    @Override
    public Result update(Match match) {
        return null;
    }

    @Override
    public Result changeActivity(int id) {
        return null;
    }
}
