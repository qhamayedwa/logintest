# logintest

# Employee Management System

A Java Spring Boot application for managing employee data using REST APIs.

## Technologies Used

- Java
- Spring Boot
- MySQL
- Maven

## Features

- Create, Read, Update, and Delete (CRUD) operations for employees
- RESTful APIs for interacting with employee data
- Database integration using Spring Data JPA

## Getting Started

To run the application locally:

1. Clone the repository.
2. Set up a MySQL database and update the application.properties file with the database configuration.
3. Build the application using Maven: `mvn clean package`

## Usage

### Endpoints

- POST `/employee/add`: Add a new employee (example JSON payload: `{ "name": "Qhama", "msisdn": "0123456789" }`)
- GET `/employee/getAll`: Get all employees
- GET `/employee/{id}`: Get employee by ID
- PUT `/employee/update/{id}`: Update employee by ID
- DELETE `/employee/delete/{id}`: Delete employee by ID

