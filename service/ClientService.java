package ru.kpfu.itis.ra.service;

import ru.kpfu.itis.ra.models.Client;

import java.util.List;

/**
 * Created by rubenahmadiev on 07.05.16.
 */
public interface ClientService {

    List<Client> getAll();

    Client getById(Integer id);

    Client create(Client client);

    Client delete(Integer id);

}
