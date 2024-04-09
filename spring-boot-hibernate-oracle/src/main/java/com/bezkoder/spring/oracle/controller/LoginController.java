package com.bezkoder.spring.oracle.controller;

import com.bezkoder.spring.oracle.common.APIResponse;
import com.bezkoder.spring.oracle.dto.LoginRequestDTO;
import com.bezkoder.spring.oracle.service.LoginService;
import com.bezkoder.spring.oracle.util.JwtUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/")
public class LoginController {
    @Autowired
    private LoginService loginService;

    @Autowired
    private JwtUtils jwtUtils;

    @PostMapping("auth/login")
    public ResponseEntity<APIResponse> login(@RequestBody LoginRequestDTO loginRequestDTO ){

        APIResponse apiResponse = loginService.login(loginRequestDTO);

        return ResponseEntity
                .status(apiResponse.getStatus())
                .body(apiResponse);
    }
}
