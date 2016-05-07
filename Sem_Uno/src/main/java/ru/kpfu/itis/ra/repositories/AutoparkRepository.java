package ru.kpfu.itis.ra.repositories;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import ru.kpfu.itis.ra.models.Autopark;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;


/**
 * Created by rubenahmadiev on 01.05.16.
 */
@Repository
public interface AutoparkRepository extends CrudRepository<Autopark, Integer> {

    Autopark findById(Integer id);

    List<Autopark> findAll();

//    List<Autopark> findAllbyMark(String mark);
//
//    List<Autopark> findAllbyType(String type);
//
//    List<Autopark> findAllbyYear(Integer year);
//
//    List<Autopark> findAllbyDriverId(Integer carsId);



}

