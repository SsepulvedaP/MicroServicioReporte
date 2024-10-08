package com.microservice.microservicereport.domain.models;

import java.time.LocalDateTime;
import java.util.List;

public class Report {
    private String id;
    private String userEmail;
    private LocalDateTime purchaseDate;
    private double totalAmount;
    private List<ReportItem> items;

    public Report(String id, String userEmail, LocalDateTime purchaseDate, double totalAmount, List<ReportItem> items) {
        this.id = id;
        this.userEmail = userEmail;
        this.purchaseDate = purchaseDate;
        this.totalAmount = totalAmount;
        this.items = items;
    }
    public Report(){

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public LocalDateTime getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(LocalDateTime purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public List<ReportItem> getItems() {
        return items;
    }

    public void setItems(List<ReportItem> items) {
        this.items = items;
    }
}
