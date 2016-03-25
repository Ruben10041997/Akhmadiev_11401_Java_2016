package homework006;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by rubenahmadiev on 21.03.16.
 */
public class SpringMain {

    public static void main(String[] args) {

        ApplicationContext ac = new ClassPathXmlApplicationContext("homework006/spring-config.xml");
        Hatchback kalina = (Hatchback) ac.getBean("lada");
        HybridEngine hybridEngine = (HybridEngine) ac.getBean("hybridEngine");
        WindowRaiser windowRaiser = (WindowRaiser) ac.getBean("windowRaiser");
        Coupe fastCoupe = (Coupe) ac.getBean("porsche");
        Car chrysler = (Estate) ac.getBean("chrysler");
        Jeep jeep = (Jeep) ac.getBean("jeep");
        Sedan priora = (Sedan) ac.getBean("priora");
        Car cars = (Car) ac.getBean("cars");




        hybridEngine.gainTracrion();
        kalina.toSeeInfromation();
        kalina.toEnableMusic();
        kalina.toEnableCLimateControl().toBlow();
        windowRaiser.toDown();
        kalina.toEnableCLimateControl().toCool();

        fastCoupe.toUseHeadlights();
        fastCoupe.toWindowRise();

        cars.toDrive();

        kalina.toDrive();
        System.out.println();
        while (!kalina.crash) {
            kalina.gainTracrion();
            if ((kalina.engineRpm>6000)&&((kalina.getGears()<6))){
                System.out.println(kalina.toIncreaseGear());
                kalina.toIncreaseGear();
            }
        }

    }
}
