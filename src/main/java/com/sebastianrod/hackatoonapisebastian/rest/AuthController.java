package com.sebastianrod.hackatoonapisebastian.rest;

import com.sebastianrod.hackatoonapisebastian.models.Client;
import com.sebastianrod.hackatoonapisebastian.models.custom.AuthToken;
import com.sebastianrod.hackatoonapisebastian.models.custom.AuthUser;
import com.sebastianrod.hackatoonapisebastian.service.AuthService;
import com.sebastianrod.hackatoonapisebastian.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/auth")
public class AuthController {

    @Autowired
    private AuthService service;

    @PostMapping("signIn")
    private Boolean signIn(@RequestBody AuthUser user){

        return service.checkCredentials(user);
    }

}
