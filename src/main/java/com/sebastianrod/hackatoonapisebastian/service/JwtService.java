//package com.sebastianrod.hackatoonapisebastian.service;
//
//import com.sebastianrod.hackatoonapisebastian.models.Client;
//import com.sebastianrod.hackatoonapisebastian.models.custom.AuthToken;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
//import org.springframework.stereotype.Service;
//
//import java.security.Key;
//import java.util.Date;
//import java.util.HashMap;
//import java.util.Map;
//import java.util.Objects;
//import java.util.function.Function;
//import java.util.stream.Collectors;
//
//@Service
//public class JwtService {
//
//    private static final String JWT_SECRET_KEY = "TLGZ15PX!#Hig@4W^wU8^%aZGPWSfCM*$UPb3I1zOTSYlI9SND";
//
//    public static final long JWT_TOKEN_VALIDITY = 1000 * 60 * 60 * (long) 24;
//
//    public static String createToken(Client client){
//
//        Date expirationDate = new Date(System.currentTimeMillis() + JWT_TOKEN_VALIDITY);
//
//        Map<String, Object> claims = new HashMap<>();
//        claims.put("email", client.getEmail());
//        claims.put("password", client.getPassword());
//        claims.put("id", client.getId());
//
//        return Jwts.builder()
//                .setSubject(client.getEmail())
//                .setExpiration(expirationDate)
//                .addClaims(claims)
//                .signWith(, JWT_SECRET_KEY)
//                .compact();
//    }
//
//    public static UsernamePasswordAuthenticationToken getAuthentication(String token){
//        Claims claims = Jwts.parser()
//                .setSigningKey(JWT_SECRET_KEY.getBytes())
//
//    }
//
//}
