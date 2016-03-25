package homework007.classes;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by rubenahmadiev on 13.02.16.
 */
@Component
public class AutomaticalGearbox implements Gearbox {
    @Value("A7Comfort")
    String name;
    int gears;
    Gearbox automatic;
    double gearsRelation;

    @Override
    public String toString() {
        return "AutomaticalGearbox{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public String toIncreaseGear() {
      return "Автоматическое поышение передачи";
    }

    @Override
    public String toDescreaseGear() {
        return "Автоматическое повышение передачи";
    }

    @Override
    public String toNeutral() {
        return "Автоматический переход в нейтральный режим";
    }
}
