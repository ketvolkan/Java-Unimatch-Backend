package com.adu.tinder.dataAccess.abstracts;

import com.adu.tinder.core.utilities.results.DataResult;
import com.adu.tinder.entities.concretes.Report;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReportDao extends JpaRepository<Report,Integer> {
    List<Report> getByUserId(int id);
    List<Report> getById(int id);
}
