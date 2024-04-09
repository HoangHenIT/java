package com.bezkoder.spring.oracle.service;

import com.bezkoder.spring.oracle.common.APIResponse;
import com.bezkoder.spring.oracle.dto.LoginRequestDTO;
//import com.bezkoder.spring.oracle.entity.Users;
//import com.bezkoder.spring.oracle.repository.UserRepository;
import com.bezkoder.spring.oracle.util.JwtUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

//@Service
//public class LoginService {
//
////    @Autowired
////    private UserRepository userRepository;
////    @Autowired
////    private JwtUtils jwtUtils;
////
////
////    public APIResponse login(LoginRequestDTO loginRequestDTO) {
////
////        APIResponse apiResponse = new APIResponse();
////        // verify user exist with given username and password
////        Users user = userRepository.findOneByUserNamIgnoreCaseAndPassword(loginRequestDTO.getUsername(), loginRequestDTO.getPassword());
////
////        // response
////        if(user == null){
////            apiResponse.setData("User login failed");
////            return apiResponse;
////        }
////
////        // generate jwt
////        String token = jwtUtils.generateJwt(user);
////
////        Map<String , Object> data = new HashMap<>();
////        data.put("accessToken", token);
////
////        apiResponse.setData(data);
////
////        return apiResponse;
////    }
//}
