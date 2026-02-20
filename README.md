# Log Backend Elastic

A Spring Boot application that collects and forwards application error logs to Elasticsearch.

## Setup Instructions

### Prerequisites

- Java 17+
- Maven 3.6+
- Docker & Docker Compose (for containerized deployment)

### Java Packaging

1. **Build the project:**

   ```bash
   mvn clean package
   ```

   This generates a JAR file in the `target/` directory.

2. **Run locally:**
   ```bash
   java -jar target/log-backend-elastic-0.0.1-SNAPSHOT.jar
   ```

### Docker

1. **Build the Docker image:**

   ```bash
   docker build -t log-backend-elastic .
   ```

2. **Run with Docker Compose:**
   ```bash
   docker-compose up
   ```

## Environment Variables

See `.env.example` for reference.
