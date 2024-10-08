package com.microservice.microservicereport.application.handler;

import com.microservice.microservicereport.application.dto.ReportRequest;
import com.microservice.microservicereport.application.mapper.ReportRequestMapper;
import com.microservice.microservicereport.domain.api.IReportServicePort;
import com.microservice.microservicereport.domain.models.Report;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
@RequiredArgsConstructor
public class ReportHandler implements IReportHandler {

    private final IReportServicePort reportServicePort;
    private final ReportRequestMapper reportRequestMapper;

    @Override
    public void createReport(ReportRequest reportRequest) {
        Report report = reportRequestMapper.toReport(reportRequest);
        reportServicePort.createReport(report);
    }
}
