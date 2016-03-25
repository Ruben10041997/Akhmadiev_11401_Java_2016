package homework009;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by rubenahmadiev on 22.03.16.
 */

@Configuration
@ComponentScan("homework009.*")
public class SpringConfig {

    @Bean
    ComplexMatrix2x2 complexMatrix2x2() {
        return new ComplexMatrix2x2();
    }

    @Bean
    ComplexVector2D complexVector2D() {
        return new ComplexVector2D(complexNumberZeroFour(), complexNumberZeroFour());
    }


    @Bean
    ComplexNumber complexNumberTwo() {
        return new ComplexNumber(2.0, 2.0);
    }


    @Bean
    ComplexNumber complexNumberOne() {
        return new ComplexNumber(1.0, 1.0);
    }

    @Bean
    ComplexNumber complexNumberZero() {
        return new ComplexNumber(0.0, 0.0);
    }

    @Bean
    ComplexNumber complexNumberZeroFour() {
        return new ComplexNumber(0.0, 4.0);
    }

    @Bean
    ComplexNumber complexNumberZeroMinusFour() {
        return new ComplexNumber(0.0, -4.0);
    }


}
