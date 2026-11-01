package com.houssem.patientservice.service;


import com.houssem.patientservice.dto.PatientResponseDto;
import com.houssem.patientservice.mapper.PatientMapper;
import com.houssem.patientservice.model.Patient;
import com.houssem.patientservice.repository.PatientRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PatientService {

    private final PatientRepository patientRepository ;



    public List<PatientResponseDto> getPatients(){


         List<Patient> patients = this.patientRepository.findAll();
         return patients.stream().map(PatientMapper::toDto).toList();


    }




}
