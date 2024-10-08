package com.microservice.microservicereport.infrastructure.configuration;


import com.microservice.microservicereport.domain.api.IReportServicePort;
import com.microservice.microservicereport.domain.spi.IReportPersistencePort;
import com.microservice.microservicereport.domain.usecase.ReportUseCase;
import com.microservice.microservicereport.infrastructure.jpa.adapter.ReportJpaAdapter;
import com.microservice.microservicereport.infrastructure.jpa.mapper.ReportEntityMapper;
import com.microservice.microservicereport.infrastructure.jpa.repository.IReportRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class BeanConfiguration {
    private final IReportRepository reportRepository;
    private final ReportEntityMapper reportEntityMapper;

    @Bean
    public IReportPersistencePort reportPersistencePort() {
        return new ReportJpaAdapter(reportRepository, reportEntityMapper);
    }

    @Bean
    public IReportServicePort reportServicePort() {
        return new ReportUseCase(reportPersistencePort());
    }
}
