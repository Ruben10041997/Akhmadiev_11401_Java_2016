package homework007.classes;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by rubenahmadiev on 12.02.16.
 */
@Component
public class SportGearbox implements Gearbox {

    @Value("sport")
    String name;
    public  static int gears = 1;
    Gearbox mechanics;
    double gearsRelation;

    int getGears(){
        return gears;
    }

    @Override
    public String toString() {
        return "SportGearbox{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public String toIncreaseGear() {
     if ((Hatchback.engineRpm>=7000)&&(gears<=6)){
         gears++;
        Hatchback.engineRpm= Hatchback.engineRpm-3000;
        String b ="Текущая передача - " + getGears();
        return b;
     } else if (((Hatchback.engineRpm<7000)&&(gears<=6))){
       String b  = "Недостаточно оборотов для переключения передачи!";
        return b;}
        else {
         String b = "Максимальная передача!";
         return b;}
    }

    @Override
    public String toDescreaseGear() {
        if ((Hatchback.engineRpm<4000)&&(gears>1)){
            gears--;
            Hatchback.engineRpm= Hatchback.engineRpm+3000;
            String showGear = "Текущая передача - " + getGears();
            return showGear;
        } else if (((Hatchback.engineRpm>=4000)&&(gears>1))){
            String b  = "Слишком много оборотов для понижения передачи!";
            return b;}
        else {
            String b = "Минимальная передача!";
            return b;}
    }

    @Override
    public String toNeutral() {
     Hatchback.engineRpm=0;
        String b ="Вы в нейтральном режиме";
        return b;
    }
}
