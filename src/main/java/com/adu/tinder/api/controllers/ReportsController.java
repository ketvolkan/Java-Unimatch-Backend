package com.adu.tinder.api.controllers;

import com.adu.tinder.business.abstracts.ReportService;
import com.adu.tinder.core.utilities.results.DataResult;
import com.adu.tinder.core.utilities.results.Result;
import com.adu.tinder.entities.concretes.Report;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/report")
@CrossOrigin
public class ReportsController {
    @Autowired
    private ReportService reportService;
    @GetMapping("/getAll")
    DataResult<List<Report>> getAll(){
        return this.reportService.getAll();
    }
    @GetMapping("/getAllByUserId")
    DataResult<List<Report>> getAllByUserId(int id){
        return this.reportService.getAllByUserId(id);
    }
    @GetMapping("/getAllById")
    DataResult<List<Report>> getAllById(int id){
        return this.reportService.getAllById(id);
    }
    @PostMapping("/add")
    Result add(Report report){
        return this.reportService.add(report);
    }
    @DeleteMapping("/delete")
    Result delete(int id){
        return this.reportService.delete(id);
    }
    @PostMapping("/update")
    Result update(Report report,int id){
        return this.reportService.update(report,id);
    }
}
