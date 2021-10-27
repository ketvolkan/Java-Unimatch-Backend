package com.adu.tinder.business.concretes;

import com.adu.tinder.business.abstracts.ReportService;
import com.adu.tinder.core.utilities.results.DataResult;
import com.adu.tinder.core.utilities.results.Result;
import com.adu.tinder.entities.concretes.Report;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReportManager implements ReportService {
    @Override
    public DataResult<List<Report>> getAll() {
        return null;
    }

    @Override
    public DataResult<List<Report>> getAllByUserId(int id) {
        return null;
    }

    @Override
    public DataResult<List<Report>> getAllById(int id) {
        return null;
    }

    @Override
    public Result add(Report report) {
        return null;
    }

    @Override
    public Result delete(Report report) {
        return null;
    }

    @Override
    public Result update(Report report) {
        return null;
    }
}
