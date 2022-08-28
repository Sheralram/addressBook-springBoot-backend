package com.bridgelabz.addressbookapp.dto;

import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Data
public class UserDTO {

    @NotNull
    @Pattern(regexp = "^[A-Z][a-z]{3,}$", message= "Name Not In Proper Format")
    public String userName;

    @NotNull
    public String emailId;

    @NotNull
    public String password;



}
