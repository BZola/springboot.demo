package com.springboot.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;
import org.hibernate.annotations.Table;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.math.BigDecimal;


@Data
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
@Entity

public class Employee {
    @Id
    @GeneratedValue
    private int id;
    @NotNull(message = "please enter name")
    private String firstName;
    @NotNull
    private String lastName;
    @Email
    private String email;
    private String department;
    @NotBlank
    private String phone;


}
