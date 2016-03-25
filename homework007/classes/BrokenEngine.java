package homework007.classes;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by rubenahmadiev on 12.02.16.
 */
@Component
public class BrokenEngine implements Engine {
    int weight;
    @Value("break")
    String breakingName;
    int valves;
    int engineId;

    @Override
    public void gainTracrion() {
        System.out.println("Повысить обороты");
    }

    @Override
    public void reduceTracrion() {
        System.out.println("Понизить обороты");
    }

    @Override
    public BrokenEngine explode() {
        return null;
    }
}
