package com.houssem.patientservice.repository;


import com.houssem.patientservice.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends JpaRepository<Patient,Integer> {

    boolean existsByEmail(String email);

}
