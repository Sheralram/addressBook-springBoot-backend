package com.bridgelabz.addressbookapp.model;

public class JwtRequest {

    String emailId;
    String password;

    public JwtRequest(String emailId, String password) {
        this.emailId = emailId;
        this.password = password;
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

    @Override
    public String toString() {
        return "JwtRequest{" +
                "emailId='" + emailId + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public JwtRequest() {

    }


}
