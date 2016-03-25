package homework010.classes;

import org.springframework.stereotype.Component;

/**
 * Created by rubenahmadiev on 13.02.16.
 */
@Component
public class AutomaticalGearbox implements Gearbox {
    String name;
    int gears;
    Gearbox automatic;
    double gearsRelation;

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
