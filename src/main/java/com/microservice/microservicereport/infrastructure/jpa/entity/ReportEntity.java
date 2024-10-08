package com.microservice.microservicereport.infrastructure.jpa.entity;

import com.microservice.microservicereport.domain.models.ReportItem;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.FieldType;
import org.springframework.data.mongodb.core.mapping.MongoId;


import java.util.Date;
import java.util.List;

@NoArgsConstructor
@Data
@Getter
@Setter
@Document(collection = "reports")
public class ReportEntity {
    @MongoId(FieldType.OBJECT_ID)
    private String id;
    private String email;
    private Date purchaseDate;
    private double totalAmount;
    private List<ReportItem> items;

}
