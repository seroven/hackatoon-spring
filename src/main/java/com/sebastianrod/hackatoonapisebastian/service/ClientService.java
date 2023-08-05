package com.sebastianrod.hackatoonapisebastian.service;

import com.sebastianrod.hackatoonapisebastian.interfaces.ClientInterface;
import com.sebastianrod.hackatoonapisebastian.models.Client;
import com.sebastianrod.hackatoonapisebastian.repository.ClientRepository;
import com.sebastianrod.hackatoonapisebastian.utils.Encrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.Collection;

@Service
public class ClientService implements ClientInterface {

    @Autowired
    public ClientRepository repository;

    public final Encrypt passwordEncoded = new Encrypt();

    @Override
    public Collection<Client> getAll() {
        return repository.findByEnableTrue();
    }

    @Override
    public Client getById(Integer id) {
        try {
            return repository.findByIdEnable(id).get();
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public Client create(Client client) {
        client.setPassword(passwordEncoded.encrypt(client.getPassword()));
        return repository.save(client);
    }

    @Override
    public Client update(Integer id, Client client) {

        client.setId(id);
        if (client.getPassword().trim() == "") {
            Client clientInDb = this.getById(id);
            client.setPassword(clientInDb.getPassword());
        } else {
            client.setPassword(passwordEncoded.encrypt(client.getPassword()));
        }
        return repository.save(client);
    }

    @Override
    public Client delete(Integer id) {

        Client client = this.getById(id);
        client.setEnable(false);
        return repository.save(client);
    }


}
