package homework007;


import homework007.classes.*;
import homework007.SpringConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by rubenahmadiev on 21.03.16.
 */
public class SpringMain {

    public static void main(String[] args) {

        ApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfiguration.class);

        HybridEngine h = ac.getBean(HybridEngine.class);
        System.out.println(h);
        h.explode();
        h.gainTracrion();
        h.reduceTracrion();

        Car j = (Jeep) ac.getBean("jeep");
        System.out.println(j);
        j.toBrake();
        j.toDrive();
        j.toUseHeadlights();
        j.toWindowRise();

        Car c = ac.getBean(Coupe.class);
        System.out.println(c);
        c.toWindowRise();
        c.toUseHeadlights();
        c.toBrake();
        c.toDrive();

        Car e = ac.getBean(Estate.class);
        System.out.println(e);
        e.toDrive();
        e.toBrake();
        e.toUseHeadlights();
        e.toWindowRise();



    }
}
