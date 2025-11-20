# Financial Management System Backend

This project is a Spring Boot backend service that exposes a simple health check endpoint.

## Prerequisites

- Java 17 or newer
- Maven 3.9+

## Getting Started

1. Install dependencies and build the project:

   ```
   mvn clean package
   ```

2. Run the Spring Boot application:

   ```
   mvn spring-boot:run
   ```

3. Verify the health endpoint:

   ```
   curl http://localhost:8080/api/health
   ```

   Sample response:

   ```
   {"status":"UP","timestamp":"2025-11-08T12:00:00Z"}
   ```

## Testing

Run the unit tests with:

```
mvn test
```

