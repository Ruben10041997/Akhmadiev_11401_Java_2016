package homework007.classes;

import org.springframework.stereotype.Component;

/**
 * Created by rubenahmadiev on 12.02.16.
 */

@Component
public interface Gearbox {

    String toIncreaseGear();

    String toDescreaseGear();

    String toNeutral();

}
