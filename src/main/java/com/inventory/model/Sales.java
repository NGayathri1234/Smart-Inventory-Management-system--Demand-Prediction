package com.inventory.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Sales {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long productId;
    private int quantitySold;
    private LocalDate date;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Long getProductId() { return productId; }
    public void setProductId(Long productId) { this.productId = productId; }

    public int getQuantitySold() { return quantitySold; }
    public void setQuantitySold(int quantitySold) { this.quantitySold = quantitySold; }

    public LocalDate getDate() { return date; }
    public void setDate(LocalDate date) { this.date = date; }
}