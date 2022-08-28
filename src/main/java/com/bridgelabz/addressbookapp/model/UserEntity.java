package com.bridgelabz.addressbookapp.model;


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
    private int id;
    private String userName;
    private String emailId;
    private String password;

    public UserEntity(UserDTO userDTO) {
        super();
        this.id = id;
        this.userName=userDTO.userName;
        this.emailId = userDTO.emailId;
        this.password = userDTO.password;
    }

    public UserEntity(int id, String userName, String emailId, String password) {
        this.id = id;
        this.userName = userName;
        this.emailId = emailId;
        this.password = password;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}
