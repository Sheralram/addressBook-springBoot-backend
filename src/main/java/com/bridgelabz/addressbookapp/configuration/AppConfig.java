package com.bridgelabz.addressbookapp.configuration;


import com.bridgelabz.addressbookapp.utility.JwtToken;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class AppConfig {

    @Bean
    public BCryptPasswordEncoder bCryptPasswordEncoder(){
        return new BCryptPasswordEncoder();
    }

    @Bean
    public JwtToken jwttoken()
    {
        return new JwtToken();
    }
}