package com.sebastianrod.hackatoonapisebastian.interfaces;

import com.sebastianrod.hackatoonapisebastian.models.Client;
import com.sebastianrod.hackatoonapisebastian.models.custom.AuthToken;
import com.sebastianrod.hackatoonapisebastian.models.custom.AuthUser;

public interface AuthInterface {

    Client findByEmail(String email);
    Boolean signIn(AuthUser authUser);

    Boolean checkCredentials(AuthUser authUser);

}
