# Campus Task Board API Documentation

Project Description
Campus Task Board API is a Spring Boot REST API application used for managing campus-related tasks.  
The API supports creating, updating, retrieving, deleting, and restoring tasks while providing validation, security, logging, soft delete functionality, testing, and API documentation.

This project was developed for Homework 8 and builds upon Homework 7 enhancements.

---

## Technologies Used
- 
- Java 21
- Spring Boot 3
- Spring Security
- Spring Data JPA
- Spring Validation
- H2 Database
- Swagger / OpenAPI
- Maven
- JUnit 5
- MockMvc

---

## Features

- RESTful API design
- Spring Security integration
- CORS configuration
- API versioning
- DTO pattern
- Validation with custom validators
- Global exception handling
- Soft delete functionality
- Swagger/OpenAPI documentation
- Integration testing
- H2 in-memory database
- Spring Data JPA
- Request logging
- Actuator monitoring endpoints

---

## Base URL

http://localhost:8080

---

## API Versioning

Version 1 endpoints use:

/api/v1/tasks

This allows future API versions without breaking older clients.

---

## Security

Spring Security is configured for the application.

Allowed public endpoints:

/api/tasks/**  
/api/v1/tasks/**  
/h2-console/**  
/actuator/**  
/swagger-ui/**  
/v3/api-docs/**

CORS is enabled for:

http://localhost:3000  
http://localhost:8080

---

## Swagger Documentation

Swagger UI:

http://localhost:8080/swagger-ui/index.html

OpenAPI JSON:

http://localhost:8080/v3/api-docs

---

## H2 Database Console

http://localhost:8080/h2-console

Example configuration:

JDBC URL: jdbc:h2:mem:testdb  
Username: sa  
Password:

---

## Endpoints

## Get All Tasks

Request

GET /api/tasks

or

GET /api/v1/tasks
## Example Response
```json{[
{
"id": 1,
"title": "Homework",
"description": "Finish Java assignment",
"completed": false,
"priority": "HIGH"
}
]
```
---
### Get Task By ID
Request

GET /api/tasks/{id}

Example

GET /api/tasks/1

Example Response
```json{
"id": 1,
"title": "Homework",
"description": "Finish Java assignment",
"completed": false,
"priority": "HIGH"
}
```
---
### Create Task
Request

POST /api/tasks

Request Body
```json{
{
"title": "Study",
"description": "Prepare for exam",
"completed": false,
"priority": "HIGH"
}
```
Example Response
```json{
{
"id": 1,
"title": "Study",
"description": "Prepare for exam",
"completed": false,
"priority": "HIGH"
}
```
---
### Update Task
Request

PUT /api/tasks/{id}

Example

PUT /api/tasks/1

Request Body
```json{
{
"title": "Updated Task",
"description": "Updated description",
"completed": true,
"priority": "MEDIUM"
}
```
---
### Delete Task
Request

DELETE /api/tasks/{id}

Example

DELETE /api/tasks/1

Soft delete is used, meaning tasks are marked as deleted instead of permanently removed.
---
### Restore Task
Request

PUT /api/tasks/{id}/restore

Example

PUT /api/tasks/1/restore

---
### Validation Rules
Title
Cannot be blank
Minimum length: 3
Maximum length: 100
Description
Maximum length: 500
Priority

Allowed values:

LOW
MEDIUM
HIGH

Custom validation is implemented using:

@ValidPriority

---
### Error Responses

## 400 Bad Request
{
"timestamp": "2026-05-08T12:00:00",
"status": 400,
"error": "Bad Request",
"message": "Validation failed"
}
---
## 404 Not Found
```json{
"timestamp": "2026-05-08T12:00:00",
"status": 404,
"error": "Not Found",
"message": "Task not found"
}
```
---
## 500 Internal Server Error
```json{
"timestamp": "2026-05-08T12:00:00",
"status": 500,
"error": "Internal Server Error",
"message": "Unexpected error occurred"
}
```
---
### Testing

Integration tests were implemented using:

JUnit 5
Spring Boot Test
MockMvc

Tested functionality includes:

Creating tasks
Retrieving tasks
Validation errors
Not found responses
---


### Running the Application
git clone https://github.com/jmzla/HW7.git

Open Project

Open the project in IntelliJ IDEA.

### Run Application

Run:

CampusTaskboardApplication.java

Application runs on:

http://localhost:8080

## Monitoring

Spring Boot Actuator endpoints:

/actuator/health
/actuator/info


## 📸 Screenshots Included



---

## 🎥 Video Explanation

👉 Video Link:

