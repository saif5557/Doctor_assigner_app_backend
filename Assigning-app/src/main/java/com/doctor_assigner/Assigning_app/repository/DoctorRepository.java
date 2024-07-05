package com.doctor_assigner.Assigning_app.repository;

import com.doctor_assigner.Assigning_app.model.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DoctorRepository extends JpaRepository<Doctor,Long> {
    List<Doctor> findByCityAndSpeciality(String city, String speciality);
}
