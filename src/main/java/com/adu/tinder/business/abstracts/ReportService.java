package com.adu.tinder.business.abstracts;

import com.adu.tinder.core.utilities.results.DataResult;
import com.adu.tinder.core.utilities.results.Result;
import com.adu.tinder.entities.concretes.Report;

import java.util.List;

public interface ReportService {
    DataResult<List<Report>> getAll();
    DataResult<List<Report>> getAllByUserId(int id);
    DataResult<List<Report>> getAllById(int id);
    Result add(Report report);
    Result delete(int id);
    Result update(Report report,int id);
}
