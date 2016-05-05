package ru.kpfu.itis.ra.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.kpfu.itis.ra.models.Autopark;
import org.springframework.data.repository.PagingAndSortingRepository;


/**
 * Created by rubenahmadiev on 01.05.16.
 */
@Repository
public interface AutoparkRepository extends JpaRepository<Autopark, Integer> {

    Autopark findById(Integer id);

}

