package com.cydeo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Employee {

//    @NotNull      ---> Field shouldn't be null
//    @NotEmpty     ---> Field shouldn't be ""        (Empty)
//    @NotBlank     ---> Field shouldn't be "       " (Blank)

//    @NotNull    @NotNull
//    @NotEmpty   @NotNull + @NotEmpty
//    @NotBlank   @NotNull + @NotEmpty + @NotBlank (covers all of them)

    @NotBlank
    @Size(max = 12,min = 2)
    private String firstName;
    private String lastName;

    @DateTimeFormat(pattern = "yyyy-MM-dd") //thymeleaf accepts this format so, we need to tell LocalDate to format itself to avoid confusion
    private LocalDate birthday;

    private String email;
    private String password;
    private String address;
    private String address2;
    private String city;
    private String state;
    private String zipCode;

}
