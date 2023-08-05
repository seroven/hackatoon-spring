//package com.sebastianrod.hackatoonapisebastian.security;
//
//import com.sebastianrod.hackatoonapisebastian.models.Client;
//import com.sebastianrod.hackatoonapisebastian.service.AuthService;
//import org.springframework.context.annotation.Bean;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
//public class UserDetailsServiceImpl implements UserDetailsService {
//
//    public AuthService authService = new AuthService();
//
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//
//        Client client = authService.findByEmail(username);
//
//        if (client == null) {
//            throw new UsernameNotFoundException(username);
//        }
//
//        return User
//                .withUsername(client.getEmail())
//                .password(client.getPassword())
//                .build();
//    }
//
//    @Bean
//    AuthenticationManager authenticationManager(AuthenticationConfiguration
//                                                        authenticationConfiguration) throws Exception {
//        return authenticationConfiguration.getAuthenticationManager();
//    }
//
//
//}
