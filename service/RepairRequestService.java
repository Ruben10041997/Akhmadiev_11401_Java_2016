package ru.kpfu.itis.ra.service;

import ru.kpfu.itis.ra.models.Repairrequest;

import java.util.List;

/**
 * Created by rubenahmadiev on 07.05.16.
 */
public interface RepairRequestService {

    List<Repairrequest> getAll();

    List<Repairrequest> getAllByDriverId(Integer driverId);

    Repairrequest getById(Integer id);

    Repairrequest create(Repairrequest repairRequest);

    Repairrequest delete(Integer id);




}
