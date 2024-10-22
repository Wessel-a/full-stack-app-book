Here's a more compact version of the README:
Last-App Project

This project is a full-stack application using Spring Boot (backend) and Angular (frontend) with PostgreSQL as the database.
Prerequisites

Ensure the following are installed:

    Java 17+ (for Spring Boot)
    Node.js and npm (for Angular)
    PostgreSQL (for the database)

Setup
1. PostgreSQL Database

    Start PostgreSQL and create a database:

    bash

psql -U postgres
CREATE DATABASE "last-app";

Update application.properties in src/main/resources:

properties

    spring.datasource.url=jdbc:postgresql://localhost:5432/last-app
    spring.datasource.username=postgres
    spring.datasource.password=password
    spring.jpa.hibernate.ddl-auto=update

2. Spring Boot Backend

    Navigate to the Spring Boot project directory.

    Install dependencies and run the application:

    bash

    ./mvnw clean install
    ./mvnw spring-boot:run

    The backend will run at http://localhost:8080.

3. Angular Frontend

    Go to the Angular project directory.

    Install dependencies and start the frontend:

    bash

    npm install
    ng serve

    The frontend will run at http://localhost:4200 and interact with the backend API (http://localhost:8080/api/book/list).

Running the Application

    Start PostgreSQL and ensure the last-app database is running.
    Run the Spring Boot backend: mvn spring-boot:run.
    Run the Angular frontend: ng serve.
    Access the app at http://localhost:4200.
