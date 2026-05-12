package com.inventory.inventory_system;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com.inventory")
@EnableJpaRepositories(basePackages = "com.inventory.repository")
@EntityScan(basePackages = "com.inventory.model")
public class InventorySystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(InventorySystemApplication.class, args);
    }
}