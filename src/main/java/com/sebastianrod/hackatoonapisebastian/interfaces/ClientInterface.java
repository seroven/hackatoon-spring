package com.sebastianrod.hackatoonapisebastian.interfaces;

import com.sebastianrod.hackatoonapisebastian.models.Client;

import java.util.Collection;

public interface ClientInterface {

    Collection<Client> getAll();
    Client getById(Integer id);
    Client create(Client client);
    Client update(Integer id, Client client);
    Client delete(Integer id);

}
