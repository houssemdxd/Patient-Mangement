package com.houssem.patientservice.service;


import com.houssem.patientservice.dto.PatienRequestDto;
import com.houssem.patientservice.dto.PatientResponseDto;
import com.houssem.patientservice.exception.EmailAlreadyExistsException;
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





    public  PatientResponseDto createPatient(PatienRequestDto p){
        if(patientRepository.existsByEmail(p.getEmail())){

            throw  new EmailAlreadyExistsException("A patient with this email already exist"+p.getEmail());
        }
        Patient  patient  =this.patientRepository.save(PatientMapper.toModel(p));
        return  PatientMapper.toDto(patient);

    }





}
