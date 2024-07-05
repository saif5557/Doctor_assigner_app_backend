package com.doctor_assigner.Assigning_app.controllers;

import com.doctor_assigner.Assigning_app.model.Doctor;
import com.doctor_assigner.Assigning_app.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/doctors")
public class DoctorController {
    @Autowired
    private DoctorRepository doctorRepository;

    @GetMapping
    public ResponseEntity<List<Doctor>> getallDoc()throws Exception{
        List<Doctor> alldoc = doctorRepository.findAll();
        return new ResponseEntity<>(alldoc, HttpStatus.OK);
    }

    @PostMapping
    public Doctor addDoctor(@RequestBody Doctor doctor){
        return doctorRepository.save(doctor);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteDoctor(@PathVariable Long id){
        doctorRepository.deleteById(id);

        return new ResponseEntity<>("Doctor Data Deleted Successfully",HttpStatus.OK);

    }

}
