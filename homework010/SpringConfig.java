package homework010;

import homework010.classes.AutomaticalGearbox;
import homework010.classes.AutomaticalWindowRaiser;
import homework010.classes.BrokenEngine;
import homework010.classes.Coupe;
import org.junit.Before;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by rubenahmadiev on 22.03.16.
 */
@Configuration
@ComponentScan("homework010.classes")
public class SpringConfig {

    @Bean
    AutomaticalGearbox automaticalGearbox() {
        return new AutomaticalGearbox();
    }

    @Bean
    AutomaticalWindowRaiser automaticalWindowRaiser() {
        return new AutomaticalWindowRaiser();
    }

    @Bean
    BrokenEngine brokenEngine() {
        return new BrokenEngine();
    }

    @Bean
    Coupe ferrariEnzo() {
        return new Coupe("Ferrari", "Enzo");
    }

}
