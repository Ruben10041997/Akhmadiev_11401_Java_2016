package ru.kpfu.itis.ra.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.kpfu.itis.ra.models.Client;
import ru.kpfu.itis.ra.repositories.ClientRepository;
import ru.kpfu.itis.ra.service.ClientService;

import java.util.List;

/**
 * Created by rubenahmadiev on 07.05.16.
 */
@Service
@Transactional
public class ClientServiceImpl implements ClientService {

    @Autowired
    ClientRepository clientRepository;

    @Transactional
    public List<Client> getAll() {
        return clientRepository.findAll();
    }

    @Transactional
    public Client getById(Integer id) {
        return clientRepository.findById(id);
    }



    @Transactional
    public Client create(Client client) {
        client.setNameoforganization(client.getNameoforganization());
        client.setInn(client.getInn());
        client.setFieldofactivity(client.getFieldofactivity());
        client.setCeo(client.getCeo());
        client.setMailoforganization(client.getMailoforganization());
        return clientRepository.save(client);
    }

    @Transactional
    public Client delete(Integer id) {
        Client deleteClient = clientRepository.findById(id);
        clientRepository.delete(deleteClient);
        return deleteClient;
    }
}
