package com.cydeo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.*;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Employee {

//    @NotNull      ---> Field shouldn't be null
//    @NotEmpty     ---> Field shouldn't be ""        (Empty)
//    @NotBlank     ---> Field shouldn't be "       " (Blank)

    // !!! NotEmpty and NotBlank is only used with Strings !!!
    // !!! NotNull can be used with any kind or objects.

//    @NotNull    @NotNull
//    @NotEmpty   @NotNull + @NotEmpty
//    @NotBlank   @NotNull + @NotEmpty + @NotBlank (covers all of them)

    @NotBlank
    @Size(max = 12,min = 2)
    private String firstName;
    private String lastName;

//    @NotNull
    @DateTimeFormat(pattern = "yyyy-MM-dd") //thymeleaf accepts this format so, we need to tell LocalDate to format itself to avoid confusion
    private LocalDate birthday;

//    @NotBlank
//    @Email
    private String email;

//    @NotBlank
//    @Pattern(regexp = "(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).(4,)")
    private String password;
    private String address;
    private String address2;
    private String city;
    private String state;
    private String zipCode;

}
