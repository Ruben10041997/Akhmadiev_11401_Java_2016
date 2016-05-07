package ru.kpfu.itis.ra.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.kpfu.itis.ra.models.RepairRequest;
import ru.kpfu.itis.ra.repositories.RepairRequestsRepository;
import ru.kpfu.itis.ra.service.RepairRequestService;

import java.util.List;

/**
 * Created by rubenahmadiev on 07.05.16.
 */

@Transactional
@Service
public class RepairRequestServiceImpl implements RepairRequestService {

    @Autowired
    RepairRequestsRepository repairRequestsRepository;


    @Transactional
    public List<RepairRequest> getAll() {
        return repairRequestsRepository.findAll();
    }

    @Transactional
    public RepairRequest getById(Integer id) {
        return repairRequestsRepository.findById(id);
    }

    @Transactional
    public RepairRequest getByCarsId(Integer carsId) {
        return repairRequestsRepository.findByCarsId(carsId);
    }

    @Transactional
    public RepairRequest create(RepairRequest repairRequest) {
        repairRequest.setCarsId(repairRequest.getCarsId());
        repairRequest.setIssues(repairRequest.getIssues());
        return repairRequestsRepository.save(repairRequest);
    }

    @Transactional
    public RepairRequest delete(Integer id) {
        RepairRequest deleteRepairRequest = repairRequestsRepository.findById(id);
        repairRequestsRepository.delete(deleteRepairRequest);
        return deleteRepairRequest;
    }
}
