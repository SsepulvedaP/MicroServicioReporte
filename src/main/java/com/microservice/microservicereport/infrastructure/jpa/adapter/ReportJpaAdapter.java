package com.microservice.microservicereport.infrastructure.jpa.adapter;

import com.microservice.microservicereport.domain.models.Report;
import com.microservice.microservicereport.domain.spi.IReportPersistencePort;
import com.microservice.microservicereport.infrastructure.jpa.entity.ReportEntity;
import com.microservice.microservicereport.infrastructure.jpa.mapper.ReportEntityMapper;
import com.microservice.microservicereport.infrastructure.jpa.repository.IReportRepository;
import lombok.RequiredArgsConstructor;

import java.time.ZoneId;
import java.util.Date;

@RequiredArgsConstructor
public class ReportJpaAdapter implements IReportPersistencePort {

    private final IReportRepository reportRepository;
    private final ReportEntityMapper reportEntityMapper;


    @Override
    public void saveReport(Report report) {
        ReportEntity reportEntity = reportEntityMapper.toEntity(report);
        Date out = Date.from(report.getPurchaseDate().atZone(ZoneId.systemDefault()).toInstant());
        reportEntity.setPurchaseDate(out);
        reportRepository.save(reportEntity);

    }
}
