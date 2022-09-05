package com.bridgelabz.addressbookapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class LoginDTO {
    public String emailId;
//    @NotNull
//    private String emailId;
    @NotNull
    public String password;

//    public LoginDTO(){
//        super();
//    }
}
