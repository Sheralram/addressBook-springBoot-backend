package com.bridgelabz.addressbookapp.service;

import com.bridgelabz.addressbookapp.dto.UserDTO;
import com.bridgelabz.addressbookapp.model.UserEntity;
import com.bridgelabz.addressbookapp.repository.UserRepository;
import com.bridgelabz.addressbookapp.utility.JwtUtility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private JwtUtility jwtUtil;

    @Autowired
    private CustomerUserDetailsService customerUserDetailsServiceilsService;

    public UserEntity add(UserDTO userDTO) {

        UserEntity registerUser = userRepository.findByEmailId(userDTO.emailId);
        UserEntity userEntity = new UserEntity(userDTO);
        if(registerUser == null){
            userRepository.save(userEntity);
            return userEntity;
        }
        return null;
    }

    public List<UserEntity> getAll() {
        return userRepository.findAll();
    }


}
