package com.doctor_assigner.Assigning_app.repository;

import com.doctor_assigner.Assigning_app.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient,Long> {
}
