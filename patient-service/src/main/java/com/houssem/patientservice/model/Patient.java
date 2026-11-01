package com.houssem.patientservice.model;


import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import org.hibernate.annotations.AnyDiscriminatorImplicitValues;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Patient {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private  int id ;

    @NonNull
    private String name ;


    @Email
    @NonNull
    @Column(unique = true)
    private  String email ;


    @NonNull
    private String adress;

    @NotNull
    private LocalDate dateOfBirth ;



    @NotNull
    private LocalDate RegisteredDate;








}
