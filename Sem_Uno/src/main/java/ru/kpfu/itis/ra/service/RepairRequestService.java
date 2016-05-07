package ru.kpfu.itis.ra.service;

import ru.kpfu.itis.ra.models.MyUser;
import ru.kpfu.itis.ra.models.RepairRequest;

import java.util.List;

/**
 * Created by rubenahmadiev on 07.05.16.
 */
public interface RepairRequestService {

    List<RepairRequest> getAll();

    RepairRequest getById(Integer id);

    RepairRequest getByCarsId(Integer carsId);

    RepairRequest create(RepairRequest repairRequest);

    RepairRequest delete(Integer id);


}
