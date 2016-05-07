package ru.kpfu.itis.ra.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.kpfu.itis.ra.models.ClientsOrder;
import ru.kpfu.itis.ra.repositories.ClientsOrderRepository;
import ru.kpfu.itis.ra.service.ClientsOrderService;

import java.util.List;

/**
 * Created by rubenahmadiev on 07.05.16.
 */

@Service
@Transactional
public class ClientsOrderServiceImpl implements ClientsOrderService{

    @Autowired
    ClientsOrderRepository clientsOrderRepository;

    @Transactional
    public List<ClientsOrder> getAll() {
        return clientsOrderRepository.findAll();
    }

    @Transactional
    public ClientsOrder getById(Integer id) {
        return clientsOrderRepository.findById(id);
    }

    @Transactional
    public ClientsOrder getByOrdersName(String ordersName) {
        return clientsOrderRepository.findByOrdersName(ordersName);
    }

//    public List<ClientsOrder> getAllbyStatus(String status) {
//        return null;
//    }

    @Transactional
    public ClientsOrder create(ClientsOrder clientsOrder) {
        clientsOrder.setOrdersName(clientsOrder.getOrdersName());
        clientsOrder.setRequiredTransport(clientsOrder.getRequiredTransport());
        clientsOrder.setDeadline(clientsOrder.getDeadline());
        clientsOrder.setPrice(clientsOrder.getPrice());
        return clientsOrderRepository.save(clientsOrder);
    }

    @Transactional
    public ClientsOrder delete(Integer id) {
        ClientsOrder deleteClientsOrder = clientsOrderRepository.findById(id);
        clientsOrderRepository.delete(deleteClientsOrder);
        return deleteClientsOrder;
    }
}
