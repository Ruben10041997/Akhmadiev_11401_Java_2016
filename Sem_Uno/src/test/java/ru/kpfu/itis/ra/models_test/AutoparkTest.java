package ru.kpfu.itis.ra.models_test;


import ru.kpfu.itis.ra.models.Car;
import ru.kpfu.itis.ra.service.impl.CarServiceImpl;

/**
 * Created by rubenahmadiev on 24.04.16.
 */
public class AutoparkTest {

    CarServiceImpl service = new CarServiceImpl();


    public void testSaveRecord() throws Exception {
        //Создаем автомобиль для записи в БД
        Car car1 = new Car();
        car1.setMark("BMW");
        car1.setId(1);
        car1.setYear(2009);

        //Записали в БД
        //Autopark autopark = service.add(car1);

        //Вывели записанную в БД запись
        //System.out.println(autopark);
    }

}
