package com.houssem.patientservice.mapper;

import com.houssem.patientservice.dto.PatientResponseDto;
import com.houssem.patientservice.model.Patient;

public class PatientMapper {
    public static PatientResponseDto toDto(Patient p){

        PatientResponseDto patientDto = new PatientResponseDto();
        patientDto.setId(String.valueOf(p.getId()));
        patientDto.setAddress(p.getAdress());
        patientDto.setName(p.getName());
        patientDto.setEmail(p.getEmail());
        patientDto.setDateOfBirth(p.getDateOfBirth().toString());
        return patientDto;


    }



}
