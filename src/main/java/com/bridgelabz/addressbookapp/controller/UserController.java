package com.bridgelabz.addressbookapp.controller;

import com.bridgelabz.addressbookapp.dto.LoginDTO;
import com.bridgelabz.addressbookapp.dto.ResponseDTO;
import com.bridgelabz.addressbookapp.dto.UserDTO;
import com.bridgelabz.addressbookapp.model.UserEntity;
import com.bridgelabz.addressbookapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/userCreate")
    public ResponseEntity<ResponseDTO> addUser (@Valid @RequestBody UserDTO userDTO){
        System.out.println(userDTO);
        UserEntity add= userService.add(userDTO);
        System.out.println(add);
        ResponseDTO userRegisterResponseDTO = new ResponseDTO("Added Successfully!!!",add );
        return  new ResponseEntity<ResponseDTO>(userRegisterResponseDTO, HttpStatus.OK);
    }

    @GetMapping(path = "/userList")
    public ResponseEntity<ResponseDTO>getAllUser(){
        List<UserEntity> list = userService.getAll();
        ResponseDTO userRegisterResponseDto = new ResponseDTO("All List User !!", list);
        return new ResponseEntity<ResponseDTO>(userRegisterResponseDto,HttpStatus.OK);
    }

    @PostMapping(path = "/login")
    public ResponseEntity<ResponseDTO>loginUser(@RequestBody LoginDTO loginDTO){

        ResponseDTO responseDTO = new ResponseDTO("User Logged In Successfully!!!", userService.loginUser(loginDTO));
        return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);


//        ResponseDTO responseDTO = userService.loginUser(loginDTO);
//        return  new ResponseEntity<ResponseDTO>(responseDTO,HttpStatus.OK);
    }
}
