# To-Do Application

A RESTful To-do application built with Java Spring Boot, featuring JWT authentication, role-based access control, and full CRUD functionality for managing tasks

## Features

- User registration and login
- JWT-based authentication
- Role-based access (Admin and User)
- CRUD operations for To-do items
- Exception handling with custom responses
- Swagger API documentation

## Technologies

- Java 17
- Spring Boot 3.x
- Spring Security
- JWT (JSON Web Tokens)
- Spring Data JPA
- MySQL Database
- Maven
- Swagger for API documentation

## Project Structure

```
src/
├── main/java/com/dhiraj/myproject/todos/
│   ├── config/              # Security, JWT, Swagger configurations
│   ├── controller/          # REST API controllers
│   ├── entity/              # JPA entities: User, Todo, Authority
│   ├── exception/           # Custom exception handlers and responses
│   ├── repository/          # JPA repositories
│   ├── request/             # DTOs for requests
│   ├── response/            # DTOs for responses
│   ├── service/             # Service layer implementations
│   └── util/                # Utility classes
└── resources/
    ├── application.properties
    ├── static/
    └── templates/
```

## Getting Started

### Prerequisites

- Java 17+
- Maven 3.8+
- MySQL 8.0+ (running on port 3307)
- Git

### Installation

1. Clone the repository:
```bash
git clone https://github.com/Dhiraj8680/To-do.git
cd To-do
```

2. Build the project:
```bash
mvn clean install
```

3. Run the application:
```bash
mvn spring-boot:run
```

4. Access API documentation at:
```
http://localhost:8080/docs
```

## API Endpoints

### Authentication
- `POST /api/auth/register` - Register new user
- `POST /api/auth/login` - Authenticate user and get JWT token

### User Management
- `GET /api/users` - Get all users (Admin only)
- `PUT /api/users/password` - Update password

### To-do Management
- `POST /api/todos` - Create a new to-do
- `GET /api/todos` - Get all to-dos
- `GET /api/todos/{id}` - Get specific to-do
- `PUT /api/todos/{id}` - Update a to-do
- `DELETE /api/todos/{id}` - Delete a to-do

## Authentication

The application uses JWT tokens for authentication. After logging in, include the JWT token in the Authorization header:

```
Authorization: Bearer <your-jwt-token>
```

## Configuration

Create or update your `application.properties` file with the following configuration:

```properties
# Application
spring.application.name=todos

# Database (MySQL Example - REPLACE WITH YOUR VALUES)
spring.datasource.url=jdbc:mysql://localhost:3307/YOUR_DATABASE_NAME?serverTimezone=UTC
spring.datasource.username=YOUR_DB_USERNAME
spring.datasource.password=YOUR_DB_PASSWORD

# JPA/Hibernate
spring.jpa.hibernate.ddl-auto=update
spring.jpa.open-in-view=false

# Swagger Documentation
springdoc.swagger-ui.path=/docs

# JWT (Generate your own secret)
spring.jwt.secret=your-256-bit-secret-here
spring.jwt.expiration=900000  # 15 minutes in milliseconds
```

**Important:** Replace the placeholder values with your actual database credentials and generate a secure JWT secret key.

## Contributing

1. Fork the repository
2. Create a feature branch
3. Commit your changes
4. Push to the branch
5. Open a Pull Request

## License

This project is licensed under the MIT License.
