//package com.bridgelabz.addressbookapp.controller;
//
//import com.bridgelabz.addressbookapp.model.JwtRequest;
//import com.bridgelabz.addressbookapp.model.JwtResponse;
//import com.bridgelabz.addressbookapp.service.CustomerUserDetailsService;
//import com.bridgelabz.addressbookapp.utility.JwtUtility;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.authentication.BadCredentialsException;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.web.bind.annotation.*;
//import org.springframework.web.bind.annotation.RequestMethod;
//
//@CrossOrigin("*")
//@RestController
//public class JwtController {
//
//    Logger logger= LoggerFactory.getLogger(JwtController.class);
//    @Autowired
//    private CustomerUserDetailsService customUserDeatilsService;
//
//    @Autowired
//    private JwtUtility jwtUtil;
//
//    @Autowired
//    private AuthenticationManager authenticationManager;
//
//    @CrossOrigin(origins = "*")
//    @RequestMapping(value= "/token", method = RequestMethod.POST)
//    public ResponseEntity<?> generateToken(@RequestBody JwtRequest jwtRequest) throws Exception{
////        System.out.println(jwtRequest);
//        logger.info(jwtRequest.toString());
//        try {
//            this.authenticationManager
//                    .authenticate(new UsernamePasswordAuthenticationToken(jwtRequest.getEmailId(), jwtRequest.getPassword()));
//
//        }catch(UsernameNotFoundException e) {
//            e.printStackTrace();
////            System.out.println(jwtRequest);
//            logger.info(jwtRequest.toString());
//            throw new Exception("wrong");
//        }catch(BadCredentialsException e) {
//            e.printStackTrace();
////            System.out.println(jwtRequest);
//            logger.info(jwtRequest.toString());
//            throw new Exception("wrong!");
//        }
//
//        UserDetails userDetails = this.customUserDeatilsService.loadUserByUsername(jwtRequest.getEmailId());
//        String token=this.jwtUtil.generateToken(userDetails);
//
//        return ResponseEntity.ok(new JwtResponse(token));
//
//    }
//
//}
