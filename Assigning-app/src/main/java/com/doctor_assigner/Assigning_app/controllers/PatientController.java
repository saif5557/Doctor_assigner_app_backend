package com.doctor_assigner.Assigning_app.controllers;

import com.doctor_assigner.Assigning_app.model.Doctor;
import com.doctor_assigner.Assigning_app.model.Patient;
import com.doctor_assigner.Assigning_app.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/patients")
public class PatientController {

    @Autowired
    private PatientRepository patientRepository;

    @GetMapping
    public ResponseEntity<List<Patient>> getallPatient()throws Exception{
        List<Patient> allpatient = patientRepository.findAll();
        return new ResponseEntity<>(allpatient, HttpStatus.OK);
    }

    @PostMapping
    public Patient addPatient(@RequestBody Patient patient){
        return patientRepository.save(patient);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deletePatient(@PathVariable Long id){
        patientRepository.deleteById(id);

        return new ResponseEntity<>("Patient data Deleted Successfully",HttpStatus.OK);
    }
}
