# Spring MVC Registration Form Exercise

This project is a simple Spring MVC application demonstrating a user registration form with server-side validation.

## Features

- User registration form with fields for name, email, and phone number.
- Server-side validation using Spring's validation framework and custom constraints.
- Custom validator for phone number format.
- Displays a success page upon successful registration.
- Uses Thymeleaf for server-side rendering of HTML templates.

## Technologies Used

- Spring Boot
- Spring MVC
- Thymeleaf
- Java
- Maven

## Prerequisites

- Java Development Kit (JDK) 8 or higher
- Maven

## Building and Running

1.  Clone the repository:
    ```bash
    git clone <repository_url>
    ```
2.  Navigate to the project directory:
    ```bash
    cd spring-mvc-exercise-registration-form
    ```
3.  Build the project using Maven:
    ```bash
    mvn clean install
    ```
4.  Run the application:
    ```bash
    mvn spring-boot:run
    ```

The application will start on http://localhost:8080.

## Project Structure

- `src/main/java`: Contains the Java source code, including controllers, models, and validation classes.
- `src/main/resources/templates`: Contains the Thymeleaf HTML templates (`register-form.html`, `register-success.html`).
- `src/main/resources/application.properties`: Contains application configuration.
- `pom.xml`: Maven project file.
