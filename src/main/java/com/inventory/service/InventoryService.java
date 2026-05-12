package com.inventory.service;

import com.inventory.model.Product;
import com.inventory.model.Sales;
import com.inventory.repository.ProductRepository;
import com.inventory.repository.SalesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InventoryService {

    @Autowired
    private ProductRepository productRepo;

    @Autowired
    private SalesRepository salesRepo;

    public Product addProduct(Product product) {
        return productRepo.save(product);
    }

    public List<Product> getAllProducts() {
        return productRepo.findAll();
    }
    
    public List<Sales> getAllSales() {
        return salesRepo.findAll();
    }

    public Sales recordSale(Sales sale) {

        Product product = productRepo.findById(sale.getProductId()).orElse(null);

        if (product != null) {
            product.setQuantity(product.getQuantity() - sale.getQuantitySold());
            productRepo.save(product);
        }

        return salesRepo.save(sale);
    }

    public double predictDemand(Long productId) {

        List<Sales> sales = salesRepo.findByProductId(productId);

        int total = 0;

        for (Sales s : sales) {
            total += s.getQuantitySold();
        }

        if (sales.size() == 0) return 0;

        return total / (double) sales.size();
    }
}