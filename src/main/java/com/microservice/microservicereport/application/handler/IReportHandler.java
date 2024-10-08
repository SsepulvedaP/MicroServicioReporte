package com.microservice.microservicereport.application.handler;

import com.microservice.microservicereport.application.dto.ReportRequest;

public interface IReportHandler {
    void createReport(ReportRequest reportRequest);
}
