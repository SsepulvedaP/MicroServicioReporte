package com.microservice.microservicereport.infrastructure.jpa.repository;

import com.microservice.microservicereport.infrastructure.jpa.entity.ReportEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IReportRepository extends MongoRepository<ReportEntity, String> {
}
