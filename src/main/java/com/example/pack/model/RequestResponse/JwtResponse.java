package com.example.pack.model.RequestResponse;


import com.example.pack.model.Employee;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class JwtResponse {

    private Employee employee;
    private String jwtToken;


}
