package ru.kpfu.itis.ra.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.kpfu.itis.ra.models.Client;
import ru.kpfu.itis.ra.models.MyUser;
import ru.kpfu.itis.ra.models.RepairRequest;

import java.util.List;

/**
 * Created by rubenahmadiev on 07.05.16.
 */

@Repository
public interface RepairRequestsRepository extends JpaRepository<RepairRequest, Integer> {

    List<RepairRequest> findAll();

    RepairRequest findById(Integer id);

    RepairRequest findByCarsId(Integer carsId);


}
