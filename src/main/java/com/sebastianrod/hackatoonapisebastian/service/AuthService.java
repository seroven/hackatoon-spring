package com.sebastianrod.hackatoonapisebastian.service;

import com.sebastianrod.hackatoonapisebastian.interfaces.AuthInterface;
import com.sebastianrod.hackatoonapisebastian.models.Client;
import com.sebastianrod.hackatoonapisebastian.models.custom.AuthToken;
import com.sebastianrod.hackatoonapisebastian.models.custom.AuthUser;
import com.sebastianrod.hackatoonapisebastian.repository.AuthRepository;
import com.sebastianrod.hackatoonapisebastian.repository.ClientRepository;
import com.sebastianrod.hackatoonapisebastian.utils.Encrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthService implements AuthInterface {

    @Autowired
    public AuthRepository repository;

    public final Encrypt encrypt = new Encrypt();

    @Override
    public Boolean checkCredentials(AuthUser authUser) {
        Client client = this.findByEmail(authUser.getEmail());

        if (client == null) {
            return false;
        } else {
            Boolean checkPassword = encrypt.match(client.getPassword(), authUser.getPassword());
            return checkPassword;
        }
    }

    @Override
    public Client findByEmail(String email) {
        try {
            return repository.findByEmail(email).get();

        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public Boolean signIn(AuthUser authUser) {
        return checkCredentials(authUser);
    }


}
