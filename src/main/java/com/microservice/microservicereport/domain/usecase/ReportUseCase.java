package com.microservice.microservicereport.domain.usecase;

import com.microservice.microservicereport.domain.api.IReportServicePort;
import com.microservice.microservicereport.domain.models.Report;
import com.microservice.microservicereport.domain.spi.IReportPersistencePort;

import java.time.LocalDateTime;

public class ReportUseCase implements IReportServicePort {

    private final IReportPersistencePort reportPersistencePort;

    public ReportUseCase(IReportPersistencePort reportPersistencePort) {
        this.reportPersistencePort = reportPersistencePort;
    }


    @Override
    public void createReport(Report report) {
            report.setPurchaseDate(LocalDateTime.now());
            reportPersistencePort.saveReport(report);
    }
}
