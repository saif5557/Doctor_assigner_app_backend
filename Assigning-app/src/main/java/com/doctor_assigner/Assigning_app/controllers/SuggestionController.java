package com.doctor_assigner.Assigning_app.controllers;

import com.doctor_assigner.Assigning_app.model.Doctor;
import com.doctor_assigner.Assigning_app.model.Patient;
import com.doctor_assigner.Assigning_app.repository.DoctorRepository;
import com.doctor_assigner.Assigning_app.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/suggestions")
public class SuggestionController {

    @Autowired
    private DoctorRepository doctorRepository;

    @Autowired
    private PatientRepository patientRepository;

    @GetMapping("/{patientId}")
    public ResponseEntity<?> suggestDoctors(@PathVariable Long patientId){
        Optional<Patient> patientOptional = patientRepository.findById(patientId);
        if(patientOptional.isPresent()){
            Patient patient = patientOptional.get();
            List<Doctor> doctorList = doctorRepository.findByCityAndSpeciality(patient.getCity(),mapSymptomToSpeciality(patient.getSymptom()));
            if(doctorList.isEmpty()){
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body("There isn’t any doctor present at your location for your symptom");
            }
            return ResponseEntity.ok(doctorList);
        }else{
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Patient not found");
        }
    }

    private String mapSymptomToSpeciality(String symptom){
        switch(symptom){
            case "Arthritis":
            case "Back Pain":
            case "Tissue injuries":
                return "Orthopaedic";
            case "Dysmenorrhea":
                return "Gynecology";
            case "Skin infection":
            case "skin burn":
                return "Dermatology";
            case "Ear pain":
                return "ENT";
            default:
                return null;
        }
    }
}
