# Smart Inventory Management System with Demand Prediction

A full-stack inventory management application built using Spring Boot that helps businesses manage products, track sales, and predict future product demand using historical sales data.

The system provides real-time inventory updates, sales tracking, REST APIs, and interactive dashboard visualizations for efficient stock management and business decision-making.

---

# 🚀 Live Demo

🔗 Live Application:  
https://smart-inventory-management-system-demand.onrender.com

---

# 📌 Project Overview

The Smart Inventory Management System is designed to:

- Manage product inventory efficiently
- Track and record sales transactions
- Automatically update stock quantities
- Predict future product demand
- Provide graphical dashboard analytics

The project demonstrates full-stack Java development using Spring Boot, REST APIs, database integration, and frontend dashboard visualization.

---

# 🛠️ Technologies Used

## Backend
- Java
- Spring Boot
- Spring Data JPA
- REST APIs
- Maven

## Frontend
- HTML5
- CSS3
- JavaScript
- Chart.js

## Database
- MySQL
- PostgreSQL (for cloud deployment)

## Deployment
- Render

---

# 🏗️ System Architecture

The project follows a 3-layer architecture:

## 1. Presentation Layer (Frontend)
- Product dashboard
- Product and sales tables
- Inventory analytics charts
- Responsive UI design

## 2. Business Layer (Backend)
- Spring Boot REST Controllers
- Service layer for business logic
- Demand prediction algorithms

## 3. Data Layer
- Product Repository
- Sales Repository
- Database persistence using JPA

---

# 📦 Modules of the System

## 🔹 Product Management Module
- Add new products
- View all products
- Manage stock inventory
- Automatic quantity updates

## 🔹 Sales Management Module
- Record product sales
- Maintain sales history
- Reduce inventory after sales

## 🔹 Demand Prediction Module

The system predicts future demand using historical sales data.

### Formula Used

Average Demand = Total Quantity Sold / Number of Sales Records

## 🔹 Dashboard Module
- Product inventory visualization
- Category-wise stock analysis
- Sales tracking charts
- Interactive analytics dashboard

---

# 🗄️ Database Design

## Product Table

|  Column  |        Description       |
|----------|--------------------------|
|    id    |        Primary Key       |
|   name   |       Product name       |
| category |     Product category     |
|  price   |      Product price       |
| quantity | Available stock quantity |

---

## Sales Table

|    Column     |  Description  |
|---------------|---------------|
|       id      |  Primary Key  |
|   product_id  |  Foreign Key  |
| quantity_sold | Sold quantity |
|     date      |   Sales date  |

---

# 🔌 REST API Endpoints

## Product APIs

| Method |    Endpoint   |   Description    |
|--------|---------------|------------------|
|  POST  | /api/product  |   Add product    |
|  GET   | /api/products | Get all products |

---

## Sales APIs

| Method |  Endpoint  |  Description  | 
|--------|------------|---------------|
| POST   | /api/sale  | Record sale   |
| GET    | /api/sales | Get all sales |

---

## Prediction API

| Method |    Endpoint       |       Description      |
|--------|-------------------|------------------------|
|  GET   | /api/predict/{id} | Predict product demand |

---

# ⚙️ Workflow of the System

1. User adds products into inventory  
2. Sales are recorded when products are sold  
3. Product quantity gets updated automatically  
4. Historical sales data is analyzed  
5. Demand is predicted using average sales logic  
6. Dashboard charts visualize inventory insights  

---

# ✨ Features

- Full-stack inventory management system
- Real-time stock updates
- Sales tracking functionality
- Demand prediction logic
- REST API architecture
- Interactive dashboard visualizations
- Category-wise inventory analysis
- Responsive user interface

---

# 📈 Future Enhancements

- Machine Learning-based demand forecasting
- Low-stock alert notifications
- Weekly and monthly sales trend analysis
- User authentication and authorization
- Advanced analytics dashboard
- Export reports in PDF/CSV format

---

# ▶️ How to Run the Project Locally

## Prerequisites

- Java 17+
- Maven
- MySQL or PostgreSQL
- IDE such as NetBeans / IntelliJ / Eclipse

---

## Steps

### 1. Clone the Repository

```bash
git clone <your-github-repo-link>
```

---

### 2. Configure Database

Update application.properties with your database credentials.

---

### 3. Run the Project

```bash
mvn spring-boot:run
```

---

### 4. Open in Browser

```text
http://localhost:8080
```

---

# ☁️ Deployment

The application is deployed using:

- Render for hosting
- PostgreSQL cloud database

---

# 📚 Learning Outcomes

This project helped in understanding:

- Full-stack Java development
- Spring Boot architecture
- REST API implementation
- Database integration with JPA
- Demand prediction logic
- Cloud deployment using Render
- Dashboard and chart visualization

---



# 📄 License

This project is developed for educational and internship learning purposes.
