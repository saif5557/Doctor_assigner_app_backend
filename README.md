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



## API Endpoints Screen shots

# Add Doctor

![add doctor](https://github.com/saif5557/Doctor_assigner_app_backend/assets/83996409/9d6a0a78-1147-4966-afcd-fd281514e077)

# Get all Doctor
![get doc](https://github.com/saif5557/Doctor_assigner_app_backend/assets/83996409/9aed614c-3ad7-47d1-9d70-9d118b514fb7)

# Remove the Doctor
![del doctor](https://github.com/saif5557/Doctor_assigner_app_backend/assets/83996409/2e571739-9e72-447a-99b8-66444141313f)

# Add Patients
![post Patient](https://github.com/saif5557/Doctor_assigner_app_backend/assets/83996409/012c4ba1-2d0e-4704-9710-48ad599bdb18)

# Get all Patients
![get patients](https://github.com/saif5557/Doctor_assigner_app_backend/assets/83996409/4faeed54-3ad5-4089-878b-64d9048fc560)

# Remove Patients
![delete patient](https://github.com/saif5557/Doctor_assigner_app_backend/assets/83996409/619902a5-06ec-44c4-9671-3bec06aa307c)

# Get Suggestion
![suggesstion](https://github.com/saif5557/Doctor_assigner_app_backend/assets/83996409/e84b4534-e813-4b43-94eb-978060c0dc1e)

![sugg 2](https://github.com/saif5557/Doctor_assigner_app_backend/assets/83996409/852549bb-b9c1-479b-8e6e-ae6476e4bb15)





