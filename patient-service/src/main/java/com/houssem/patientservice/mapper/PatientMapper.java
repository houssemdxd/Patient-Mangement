package com.houssem.patientservice.mapper;

import com.houssem.patientservice.dto.PatienRequestDto;
import com.houssem.patientservice.dto.PatientResponseDto;
import com.houssem.patientservice.model.Patient;

import java.time.LocalDate;

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



    public  static  Patient toModel(PatienRequestDto patient){

        Patient p = new Patient();
        p.setName(patient.getName());
        p.setAdress(patient.getAddress());
        p.setEmail(patient.getEmail());
        p.setDateOfBirth(LocalDate.parse(patient.getDateOfBirth()));
        p.setRegisteredDate(LocalDate.parse(patient.getRegisteredDAte()));
        return  p;


    }



}
