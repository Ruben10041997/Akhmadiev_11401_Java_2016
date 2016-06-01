package ru.kpfu.itis.ra.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.kpfu.itis.ra.models.Client;

import java.util.List;

/**
 * Created by rubenahmadiev on 07.05.16.
 */

@Repository
public interface ClientRepository extends JpaRepository<Client, Integer> {

    List<Client> findAll();

    Client findById(Integer id);

//    Client findByNameOfOrganization(String nameOfOrganization);

//    List<Client> findAllbyFieldOfActivity(String fieldOfActivity);

}
