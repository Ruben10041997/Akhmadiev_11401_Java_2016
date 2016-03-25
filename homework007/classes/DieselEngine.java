package homework007.classes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by rubenahmadiev on 13.02.16.
 */
@Component
public class DieselEngine implements Engine {


    Engine diesel;
    int power;
    double fuelConsumption;
    @Value("topdieselengine")
    String name;
    int engineRpm;
    int engineTemp;
    boolean crash = false;

    @Override
    public String toString() {
        return "DieselEngine{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public void gainTracrion() {
        engineRpm=engineRpm+1000;
        engineTemp++;
        System.out.println("Жмём на газ");
        if (engineRpm > 8000){
            explode();
            crash = true;
        }

        else
            System.out.println("Текущие обороты = " + engineRpm);

    }

    @Override
    public void reduceTracrion() {
        System.out.println("Тормозим");
        engineRpm=engineRpm-1000;
        engineTemp--;
        System.out.println("Текущие обороты = " + engineRpm);

    }

    @Override
    public BrokenEngine explode() {
        System.out.println("Мотор перегрелся");
        return new BrokenEngine();}
}
