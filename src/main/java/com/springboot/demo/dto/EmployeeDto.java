package com.springboot.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Data
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
public class EmployeeDto {
    @NotNull
    private String firstName;
    private String lastName;
    @Email(message="please enter a valid email")
    private String email;
    private String department;
    @NotNull
    @Pattern(regexp = "[^0-9]*")
    private String phone;

}
