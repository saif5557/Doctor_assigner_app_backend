# Java Technical Assignment - Xcelore

This project is a backend API developed using Spring Boot and Hibernate to manage a platform where doctors can register their patients. The API allows adding and removing doctors and patients, and suggesting doctors based on a patient's symptoms and location.

## Technologies Used

- Spring Boot (Version 3)
- Hibernate
- H2 Database
- Maven

## Project Structure

```plaintext
src
├── main
│   ├── java
│   │   └── com
│   │       └── doctor_assigner
│   │           ├── controller
│   │           │   ├── DoctorController.java
│   │           │   ├── PatientController.java
│   │           │   └── SuggestionController.java
│   │           ├── entity
│   │           │   ├── Doctor.java
│   │           │   └── Patient.java
│   │           ├── repository
│   │           │   ├── DoctorRepository.java
│   │           │   └── PatientRepository.java
│   │           └── AssigningAppApplication.java
│   └── resources
│       ├── application.properties
│       └── data.sql (optional: for initial data setup)
└── test
    └── java
        └── com
            └── doctor_assigner
                └── AssigningAppApplicationTests.java





