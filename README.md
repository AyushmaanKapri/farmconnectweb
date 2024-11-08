
# FarmConnect Web

FarmConnect is a web application designed to connect farmers and consumers directly, allowing farmers to list their products and enabling consumers to browse and purchase them at fair prices. This platform facilitates direct communication, aiming to promote fair trade and improve access to fresh produce.



## Features

#### User Registration & Authentication: 
Allows users to create accounts and securely log in.
#### Product Listings: 
Farmers can list their products, and consumers can browse available items.
#### Role-Based Interface:
 Offers distinct interfaces for farmers and consumers.
#### Bargaining Feature:
Consumers can negotiate prices, and farmers can accept or counter offers.
#### Admin Panel:
 Manage users, products, and monitor activities on the platform
 
## Technologies Used

### Java  
Backend logic
### MySQL 
Database for storing user and product information
### Servlets & JSP 
For server-side handling and dynamic web content

### HTML/CSS/JavaScript 
Frontend technologies for creating responsive interfaces


## Getting Started

## Installation
#### Clone the Repository:

```http
  https://github.com/AyushmaanKapri/farmconnectweb.git
```

#### Database Setup:

* Import the provided SQL file or manually set up the database by running:

```http
  CREATE DATABASE FarmConnect;
USE FarmConnect;
CREATE TABLE User (
    id INT PRIMARY KEY AUTO_INCREMENT,
    username VARCHAR(50) NOT NULL,
    name VARCHAR(100) NOT NULL DEFAULT 'Unknown',
    password VARCHAR(255) NOT NULL,
    user_type ENUM('farmer', 'consumer', 'admin') NOT NULL,
    mobile VARCHAR(15) NOT NULL DEFAULT '0000000000'
);
```

#### Configure Database Access:

* Update your database configuration in the project code (likely in a configuration file or directly in the DAO implementation, e.g., UserDAOImpl.java).

#### Build and Deploy:

 * Compile and package the project.

* Deploy it on an Apache Tomcat server (or another servlet container) by adding the project’s .war file or deploying directly from your IDE.

### Contact
[@AyushmaanKapri](https://www.github.com/Ayushmaankapri)
## Github Link
(https://github.com/AyushmaanKapri/farmconnectweb.git)
