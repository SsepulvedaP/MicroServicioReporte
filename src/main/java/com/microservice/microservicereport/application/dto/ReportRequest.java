package com.microservice.microservicereport.application.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
public class ReportRequest {
    private Long userId;
    private List<ReportItemRequest> items;
    private double totalAmount;
    private String userEmail;
    private LocalDateTime purchaseDate;
}
