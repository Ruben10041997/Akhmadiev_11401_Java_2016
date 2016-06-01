package ru.kpfu.itis.ra.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.kpfu.itis.ra.models.Car;

import java.util.List;

/**
 * Created by rubenahmadiev on 25.05.16.
 */

@Repository
public interface CarRepository extends JpaRepository<Car, Integer> {

    Car findById(Integer id);

    Car findByMark(String mark);

    List<Car> findAll();

}
