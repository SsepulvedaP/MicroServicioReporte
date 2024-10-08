package com.microservice.microservicereport.infrastructure.jpa.mapper;

import com.microservice.microservicereport.domain.models.Report;
import com.microservice.microservicereport.infrastructure.jpa.entity.ReportEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ReportEntityMapper {
    @Mapping(target = "email", source = "report.userEmail")
    @Mapping(target = "purchaseDate", source = "report.purchaseDate")
    @Mapping(target = "totalAmount", source = "report.totalAmount")
    @Mapping(target = "items", source = "report.items")
    ReportEntity toEntity(Report report);

}
