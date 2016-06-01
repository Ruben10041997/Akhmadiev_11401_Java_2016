package ru.kpfu.itis.ra.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.kpfu.itis.ra.models.Repairrequest;

import java.util.List;

/**
 * Created by rubenahmadiev on 07.05.16.
 */

@Repository
public interface RepairRequestsRepository extends JpaRepository<Repairrequest, Integer> {

    List<Repairrequest> findAll();

    Repairrequest findById(Integer id);

    List<Repairrequest> findRequestOrderByDriverid(Integer driverid);

}
