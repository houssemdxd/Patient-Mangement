package com.houssem.patientservice.PatientController;

import com.houssem.patientservice.dto.PatienRequestDto;
import com.houssem.patientservice.dto.PatientResponseDto;
import com.houssem.patientservice.model.Patient;
import com.houssem.patientservice.service.PatientService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/patients")
@AllArgsConstructor
public class PatientController {


    private  final PatientService patientService ;


@GetMapping()
    public ResponseEntity<List<PatientResponseDto>> getPAtients (){

   List<PatientResponseDto> patients =  this.patientService.getPatients();
    return  ResponseEntity.ok().body(patients) ;

}


@PostMapping

 public  ResponseEntity<PatientResponseDto> addPatient(@Valid  @RequestBody PatienRequestDto p )
{
    PatientResponseDto patient = this.patientService.createPatient(p);
    return ResponseEntity.ok().body(patient);

}








}
