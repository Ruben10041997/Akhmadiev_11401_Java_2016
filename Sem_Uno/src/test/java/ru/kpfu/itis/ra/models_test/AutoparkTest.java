package ru.kpfu.itis.ra.models_test;

import org.junit.Test;
import ru.kpfu.itis.ra.models.Autopark;
import ru.kpfu.itis.ra.service.impl.AutoparkServiceImpl;

/**
 * Created by rubenahmadiev on 24.04.16.
 */
public class AutoparkTest {

    AutoparkServiceImpl service = new AutoparkServiceImpl();

    @Test
    public void testSaveRecord() throws Exception {
        //Создаем автомобиль для записи в БД
        Autopark car1 = new Autopark();
        car1.setMark("BMW");
        car1.setId(1);
        car1.setYear(2009);

        //Записали в БД
        //Autopark autopark = service.add(car1);

        //Вывели записанную в БД запись
        //System.out.println(autopark);
    }

}
