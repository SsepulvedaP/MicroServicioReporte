package com.microservice.microservicereport.domain.api;

import com.microservice.microservicereport.domain.models.Report;

public interface IReportServicePort {
    void createReport(Report report);
}
