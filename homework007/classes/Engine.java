package homework007.classes;

import org.springframework.stereotype.Component;

/**
 * Created by rubenahmadiev on 12.02.16.
 */
@Component
public interface Engine {

     void gainTracrion();

     void reduceTracrion();

     BrokenEngine explode();

}
