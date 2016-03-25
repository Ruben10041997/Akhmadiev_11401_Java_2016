package homework008;

import homework008.java.Client;
import homework008.java.Server;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by rubenahmadiev on 22.03.16.
 */

@Configuration
@ComponentScan("homework008.*")
public class SpringConfig {

    @Bean
    public Server server() {

        return new Server();
    }

    @Bean
    public Client client() {
        return new Client();
    }

}
