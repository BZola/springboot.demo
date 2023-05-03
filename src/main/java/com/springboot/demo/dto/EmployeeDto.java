package com.springboot.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;


@Data
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
public class EmployeeDto {
    @NotNull(message = "please enter your name!")
    private String firstName;
    private String lastName;
    @Email(message="please enter a valid email")
    private String email;
    private String department;
    @Pattern(regexp = "[^0-9]*", message = "invalid mobile number")
    @NotBlank
    private String phone;

}
