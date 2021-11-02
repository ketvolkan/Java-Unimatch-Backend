package com.adu.tinder.business.concretes;

import com.adu.tinder.business.abstracts.ReportService;
import com.adu.tinder.core.utilities.results.DataResult;
import com.adu.tinder.core.utilities.results.Result;
import com.adu.tinder.core.utilities.results.SuccessDataResult;
import com.adu.tinder.core.utilities.results.SuccessResult;
import com.adu.tinder.dataAccess.abstracts.ReportDao;
import com.adu.tinder.entities.concretes.Report;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReportManager implements ReportService {
    private ReportDao reportDao;
    @Autowired
    public ReportManager(ReportDao reportDao) {
        this.reportDao = reportDao;
    }

    @Override
    public DataResult<List<Report>> getAll() {
        return new SuccessDataResult<List<Report>>(this.reportDao.findAll(),"Listeleme Başarılı");
    }

    @Override
    public DataResult<List<Report>> getAllByUserId(int id) {
        return new SuccessDataResult<List<Report>>(this.reportDao.getByUserId(id),"Listeleme Başarılı");
    }

    @Override
    public DataResult<List<Report>> getAllById(int id) {
        return new SuccessDataResult<List<Report>>(this.reportDao.getById(id),"Listeleme Başarılı");
    }

    @Override
    public Result add(Report report) {
        this.reportDao.save(report);
        return new SuccessResult("Ekleme Başarılı");
    }

    @Override
    public Result delete(int id) {
        this.reportDao.deleteById(id);
        return new SuccessResult("Silme Başarılı");
    }

    @Override
    public Result update(Report report, int id) {
        Report updatedReport = this.reportDao.getById(id).get(0);
        updatedReport.setIssue(report.getIssue());
        this.reportDao.save(updatedReport);
        return new SuccessResult("Güncelleme Başarılı");
    }

}
