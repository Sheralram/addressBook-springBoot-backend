package com.bridgelabz.addressbookapp.model;


import com.bridgelabz.addressbookapp.dto.LoginDTO;
import com.bridgelabz.addressbookapp.dto.UserDTO;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Table(name="User")
@NoArgsConstructor

public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String userName;
    private String emailId;
    private String password;

    public UserEntity(UserDTO userDTO) {

        this.userName=userDTO.userName;
        this.emailId = userDTO.emailId;
        this.password = userDTO.password;
    }
//
//    public UserEntity(LoginDTO loginDTO) {
//        this.emailId = loginDTO.emailId;
//        this.password = loginDTO.password;
//    }

    public UserEntity(String userName, String emailId, String password) {

        this.userName = userName;
        this.emailId = emailId;
        this.password = password;
    }

}
