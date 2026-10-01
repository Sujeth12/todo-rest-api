# To-Do REST API

A REST API for managing tasks, built with Spring Boot, Spring Data JPA and H2.

## Features
- Create, read, update, and delete tasks
- Mark a task as completed
- Input validation (title is required)
- Clean JSON error responses (400, 404)
- Data saved in an H2 file database, so it survives restarts
- Layered structure: controller, service, repository, model

## Tech Stack
- Java 25
- Spring Boot 4
- Spring Data JPA
- H2 Database
- Maven

## API Endpoints

| Method | URL | Description |
|--------|-----|-------------|
| POST | `/api/tasks` | Create a task |
| GET | `/api/tasks` | Get all tasks |
| GET | `/api/tasks/{id}` | Get one task |
| PUT | `/api/tasks/{id}` | Update title and description |
| PATCH | `/api/tasks/{id}/complete` | Mark a task as completed |
| DELETE | `/api/tasks/{id}` | Delete a task |

## Example Request

POST `/api/tasks`

```json
{
  "title": "Learn Spring Boot",
  "description": "Finish project 1"
}
```

Response (201 Created):

```json
{
  "id": 1,
  "title": "Learn Spring Boot",
  "description": "Finish project 1",
  "completed": false
}
```

## Error Responses
- `404`: `{"error": "Task not found with id: 999"}`
- `400`: `{"title": "Title is required"}`

## How to Run

1. Clone the repo:
```
   git clone https://github.com/Sujeth12/todo-rest-api.git
   cd todo-rest-api
```
2. Run the app:
```
   ./mvnw spring-boot:run
```
   On Windows: `mvnw.cmd spring-boot:run`
3. The API runs at `http://localhost:8080/api/tasks`

## Project Structure

```
controller/   handles HTTP requests
service/      business logic
repository/   database access (Spring Data JPA)
model/        Task entity
exception/    custom exception and global error handler
```

## What I Learned
- Building REST APIs with Spring Boot
- Layered architecture and dependency injection
- Validation and global exception handling
- Saving data with Spring Data JPA and Hibernate