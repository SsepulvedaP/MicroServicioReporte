package com.microservice.microservicereport.application.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ReportItemRequest {
    private Long productId;
    private String productName;
    private int quantity;
    private double price;
}
