package homework007;

import homework007.classes.*;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by rubenahmadiev on 21.03.16.
 */
@Configuration
@ComponentScan(basePackages = ("homework007.classes"))
public class SpringConfiguration {



    @Bean
    @Qualifier("diesel")
    public DieselEngine dieselEngine() {
        return new DieselEngine();
    }

    @Bean
    @Qualifier("sportbox")
    public SportGearbox sportGearbox() {
        return new SportGearbox();
    }

    @Bean
    @Qualifier("automatic")
    public AutomaticalGearbox automaticalGearbox() {
        return new AutomaticalGearbox();
    }

    @Bean
    @Qualifier("hybrid")
    public HybridEngine hybridEngine() {
        return new HybridEngine();
    }

    @Bean
    @Qualifier("jeep")
    public Jeep jeep() {return new Jeep("Jeep", "Wrangler");}

    @Bean
    @Qualifier("coupe")
    public Coupe coupe() {return new Coupe("Lamborghini", "Huracan");}


    @Bean
    @Qualifier("estate")
    public Estate estate() {return new Estate("Mersedes-Benz", "R-classe");}




}
