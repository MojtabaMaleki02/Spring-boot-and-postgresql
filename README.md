# Student Management API

This project is a simple Spring Boot REST API for managing students. It uses PostgreSQL as the database and allows basic CRUD operations such as creating, reading, updating, and deleting student records.

## Table of Contents

- [Student Management API](#student-management-api)
  - [Table of Contents](#table-of-contents)
  - [Getting Started](#getting-started)
  - [Prerequisites](#prerequisites)
  - [Installation](#installation)
  - [Running the Application](#running-the-application)
  - [API Endpoints](#api-endpoints)
  - [Project Structure](#project-structure)
  - [Technologies](#technologies)

## Getting Started

To run this project, follow the instructions below to set up the environment and start the Spring Boot application.

## Prerequisites

- Java 17 or higher
- Maven 3.8+ 
- PostgreSQL

## Installation

1. Clone the repository:

```bash
git clone https://github.com/your-username/student-management-api.git
cd student-management-api
```

2. Configure PostgreSQL:

    Create a PostgreSQL database and update the `application.properties` file located in the `src/main/resources` directory with your PostgreSQL credentials:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5433/student
spring.datasource.username=your-username
spring.datasource.password=your-password
```

3. Build the project using Maven:

```bash
mvn clean install
```

## Running the Application

You can run the application using Maven or your preferred IDE:

```bash
mvn spring-boot:run
```

Once the application is running, it will be available at `http://localhost:8080`.

## API Endpoints

The following API endpoints are available:

- **GET `/api/v1/students`**
Retrieves the list of all students.

- **POST `/api/v1/students`**
Registers a new student.
Request body (example):

```json
{
  "neptun": "ABC123",
  "name": "John Doe",
  "birthDate": "2000-01-01",
  "course": "Computer Science"
}
```

- **DELETE `/api/v1/students/{studentId}`**
Deletes a student by ID.

- **PUT `/api/v1/students/{studentId}`**
Updates a student's name or course.

## Project Structure
The project is divided into the following packages:

- `com.example.demo`
Contains the main application class to bootstrap the Spring Boot application.

- `com.example.demo.student`
Contains all components related to the Student entity, including:

- **Student:** The model class representing a student.
- **StudentRepository:** Interface for database operations.
- **StudentService:** Business logic for managing students.
- **StudentController:** REST controller exposing the API.
- **StudentConfig:** Initializes the database with sample student data.

## Technologies

- **Spring Boot** - Framework for building Java applications
- **PostgreSQL** - Relational database
- **JPA (Java Persistence API)** - For database operations
- **Maven** - Dependency management and build tool