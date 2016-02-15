package work;
import work.Hatchback;
import java.util.ArrayList;

/**
 * Created by rubenahmadiev on 12.02.16.
 */
public class Main {
int ride;

    public static void main(String[] args) {
        Hatchback Kalina = new Hatchback("Lada", "Kalina");
        Car fastCoupe = new Coupe("Porsche", "911");
        Car Crysler = new Estate("Crysler", "Grand Voyager");
        Jeep Jeep = new Jeep("Jeep", "Wrangler");
        Sedan Lada = new Sedan("Lada","Priora");
        AutomaticalWindowRaiser windowRaiser  = new AutomaticalWindowRaiser();
        HybridEngine hybridEngine = new HybridEngine();

            hybridEngine.gainTracrion();
            Kalina.toSeeInfromation();
            Kalina.toEnableMusic();
            Kalina.toEnableCLimateControl().toBlow();
            windowRaiser.toDown();
            Kalina.toEnableCLimateControl().toCool();


// восходящее преобразование и позднее связывание (методы fastCoupe вызовутся, т.к. позднее связывание)

        fastCoupe.toUseHeadlights();
        fastCoupe.toWindowRise();

        //полиморфизм
        ArrayList<Car> cars = new ArrayList<Car>();
        cars.add(Kalina);
        cars.add(fastCoupe);
        cars.add(Lada);
        cars.add(Jeep);
        cars.add(Crysler);
        for(Car car : cars) {
            car.toDrive();
        }


       /*     Kalina.toDrive();
            System.out.println();
             while (!Kalina.crash) {
            Kalina.gainTracrion();
                 if ((Kalina.engineRpm>6000)&&((Kalina.getGears()<6))){
                     System.out.println(Kalina.toIncreaseGear());
                     Kalina.toIncreaseGear();
                     }
        }*/



    }
}
