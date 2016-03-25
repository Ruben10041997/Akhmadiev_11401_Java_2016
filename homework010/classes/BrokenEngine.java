package homework010.classes;

import org.springframework.stereotype.Component;

/**
 * Created by rubenahmadiev on 12.02.16.
 */
@Component
public class BrokenEngine implements Engine {
    int weight;
    String breakingName;
    int valves;
    int engineId;

    @Override
    public void gainTracrion() {
        System.out.print("Повысить обороты");
    }

    @Override
    public void reduceTracrion() {
        System.out.print("Понизить обороты");
    }

    @Override
    public BrokenEngine explode() {
        return null;
    }
}
