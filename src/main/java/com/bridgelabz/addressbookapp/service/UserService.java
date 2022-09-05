package com.bridgelabz.addressbookapp.service;

import com.bridgelabz.addressbookapp.dto.LoginDTO;
import com.bridgelabz.addressbookapp.dto.ResponseDTO;
import com.bridgelabz.addressbookapp.dto.UserDTO;
import com.bridgelabz.addressbookapp.model.UserEntity;
import com.bridgelabz.addressbookapp.repository.UserRepository;
import com.bridgelabz.addressbookapp.utility.JwtToken;
//import com.bridgelabz.addressbookapp.utility.JwtUtility;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class UserService {

    @Autowired
    private UserRepository userRepository;

//    @Autowired
//    private JwtUtility jwtUtil;

    @Autowired
    private JwtToken jwtToken;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

//    @Autowired
//    private CustomerUserDetailsService customerUserDetailsServiceilsService;

    public UserEntity add(UserDTO userDTO) {
//        System.out.println(userDTO);
//        String encodedPassword = bCryptPasswordEncoder.encode(userDTO.getPassword());
//        userDTO.setPassword(encodedPassword);
//        UserEntity user = new UserEntity(encodedPassword,userDTO.userName,userDTO.emailId);
//        System.out.println(user);
//        return userRepository.save(user);
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

    public String loginUser(LoginDTO loginDTO) {
        UserEntity userLogin =userRepository.findByEmailId(loginDTO.emailId);

        if (userLogin == null)
            return "User not found";

        if (!(bCryptPasswordEncoder.matches(loginDTO.password, userLogin.getPassword())))
            return "User name or password incorrect";

//        String token = tokenUtil.createToken(userLogin.getUser_Id());

        String token = jwtToken.jwtToken( userLogin.getId());
        log.info("LoginUser Service Method Successfully executed");

        return token;

    }

//    public ResponseDTO loginValidation(LoginDTO loginDTO) {
//        String token;
//        Optional<UserDTO> isUserPresent = userRepository.findByEmailId(loginDTO.getEmailId());
//
//        if(isUserPresent.isPresent()){
//        String password = isUserPresent.get().getPassword();
//        if(password.equals(loginDTO.getPassword())){
//            token = JwtUtility.createToken(isUserPresent.get().)
//
//     }
//        }


}






















