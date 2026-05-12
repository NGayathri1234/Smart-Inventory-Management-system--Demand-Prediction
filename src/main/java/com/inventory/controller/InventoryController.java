package com.inventory.controller;

import com.inventory.model.Product;
import com.inventory.model.Sales;
import com.inventory.service.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class InventoryController {

    @Autowired
    private InventoryService service;

    @PostMapping("/product")
    public Product addProduct(@RequestBody Product product) {
        return service.addProduct(product);
    }

    @GetMapping("/products")
    public List<Product> getProducts() {
        return service.getAllProducts();
    }
    
    @GetMapping("/sales")
    public List<Sales> getSales() {
        return service.getAllSales();
    }

    @PostMapping("/sale")
    public Sales addSale(@RequestBody Sales sale) {
        return service.recordSale(sale);
    }

    @GetMapping("/predict/{id}")
    public double predict(@PathVariable Long id) {
        return service.predictDemand(id);
    }
}