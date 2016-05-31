package ru.kpfu.itis.ra.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.kpfu.itis.ra.models.Repairrequest;
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
    public List<Repairrequest> getAll() {
        return repairRequestsRepository.findAll();
    }

    @Transactional
    public Repairrequest getById(Integer id) {
        return repairRequestsRepository.findById(id);
    }

    @Transactional
    public Repairrequest create(Repairrequest repairRequest) {
        repairRequest.setCarsid(repairRequest.getCarsid());
        repairRequest.setIssues(repairRequest.getIssues());
        return repairRequestsRepository.save(repairRequest);
    }

    @Transactional
    public Repairrequest delete(Integer id) {
        Repairrequest deleteRepairRequest = repairRequestsRepository.findById(id);
        repairRequestsRepository.delete(deleteRepairRequest);
        return deleteRepairRequest;
    }
}
