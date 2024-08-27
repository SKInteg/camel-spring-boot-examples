CREATE DATABASE training;

USE training;

CREATE TABLE Employees (
    EmployeeID INT AUTO_INCREMENT PRIMARY KEY,
    Name VARCHAR(255) NOT NULL,
    Age INT NOT NULL,
    Address VARCHAR(255),
    PhoneNumber VARCHAR(50),
    Email VARCHAR(255) UNIQUE,
    JobTitle VARCHAR(255)
);