package com.microservice.microservicereport.domain.spi;

import com.microservice.microservicereport.domain.models.Report;

public interface IReportPersistencePort {
    void saveReport(Report report);
}
