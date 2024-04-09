package com.bezkoder.spring.oracle.util;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
////import com.bezkoder.spring.oracle.entity.Users;
//import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.stereotype.Component;

import java.nio.file.AccessDeniedException;
import java.util.Date;

@Component
public class JwtUtils {

    private static String secret = "Dev@2024#";
    private static long expiryDuration = 60 * 60;

//    public String generateJwt(Users user){
//
//        long milliTime = System.currentTimeMillis();
//        long expiryTime = milliTime + expiryDuration * 1000;
//
//        Date issuedAt = new Date(milliTime);
//        Date expiryAt = new Date(expiryTime);
//
//        // claims
//        Claims claims = Jwts.claims()
//                .setIssuer(user.getMa_user().toString())
//                .setIssuedAt(issuedAt)
//                .setExpiration(expiryAt);
//
//        // optional claims
//        claims.put("Ma_user", user.getMa_user());
//        claims.put("username", user.getUsername());
//        claims.put("password", user.getPassword());
//
//        // generate jwt using claims
//        return Jwts.builder()
//                .setClaims(claims)
//                .signWith(SignatureAlgorithm.HS512, secret)
//                .compact();
//    }

    public Claims verify(String authorization) throws Exception {

        try {
            Claims claims = Jwts.parser().setSigningKey(secret).parseClaimsJws(authorization).getBody();
            return claims;
        } catch(Exception e) {
            throw new AccessDeniedException("Access Denied");
        }

    }
}