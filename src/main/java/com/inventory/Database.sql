-- =====================================
-- CREATE DATABASE
-- =====================================

CREATE DATABASE IF NOT EXISTS inventory_db;
USE inventory_db;


-- =====================================
-- DROP TABLES (SAFE ORDER)
-- =====================================
DROP TABLE IF EXISTS sales;
DROP TABLE IF EXISTS product;

-- =====================================
-- CREATE PRODUCT TABLE
-- =====================================
CREATE TABLE product (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255),
    category VARCHAR(255),
    price DOUBLE,
    quantity INT
);

-- =====================================
-- CREATE SALES TABLE (WITH FOREIGN KEY)
-- =====================================
CREATE TABLE sales (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    product_id BIGINT,
    quantity_sold INT,
    date DATE,
    FOREIGN KEY (product_id) REFERENCES product(id)
);

-- =====================================
-- INSERT PRODUCTS
-- =====================================
INSERT INTO product (name, category, price, quantity) VALUES
('Laptop', 'Electronics', 50000, 10),
('Mobile', 'Electronics', 20000, 25),
('Headphones', 'Electronics', 1500, 50),
('Keyboard', 'Electronics', 800, 40),
('Mouse', 'Electronics', 500, 60),

('Shirt', 'Clothing', 1200, 30),
('Jeans', 'Clothing', 2000, 20),
('Jacket', 'Clothing', 3500, 15),
('Shoes', 'Footwear', 3000, 18),
('Sandals', 'Footwear', 800, 35),

('Rice Bag', 'Grocery', 2500, 12),
('Wheat Flour', 'Grocery', 1200, 20),
('Sugar', 'Grocery', 900, 25),
('Milk Packet', 'Grocery', 50, 100),
('Cooking Oil', 'Grocery', 1800, 22),

('Refrigerator', 'Electronics', 55000, 5),
('Washing Machine', 'Electronics', 40000, 7),
('Air Conditioner', 'Electronics', 60000, 6),
('Mixer Grinder', 'Electronics', 3000, 25);

-- =====================================
-- INSERT SALES DATA
-- (Make sure product_id matches product table IDs)
-- =====================================
INSERT INTO sales (product_id, quantity_sold, date) VALUES
(1, 2, '2026-04-20'),
(2, 1, '2026-04-22'),
(3, 3, '2026-04-21'),
(4, 2, '2026-04-23'),
(5, 5, '2026-04-22'),
(6, 4, '2026-04-25'),

(7, 3, '2026-04-24'),
(8, 6, '2026-04-26'),
(9, 2, '2026-04-20'),
(10, 1, '2026-04-21'),
(11, 2, '2026-04-23'),
(12, 3, '2026-04-24'),
(13, 4, '2026-04-25'),
(14, 2, '2026-04-26'),
(15, 3, '2026-04-27'),

(16, 2, '2026-04-27'),
(17, 10, '2026-04-28'),
(18, 3, '2026-04-28'),
(19, 2, '2026-04-01');


-- =====================================
-- VERIFY DATA
-- =====================================
SELECT * FROM product;
SELECT * FROM sales;