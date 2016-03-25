package homework013;

import homework013.models.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by rubenahmadiev on 25.03.16.
 */
public class Main {

        public static void main(String[] args) {
            ApplicationContext ac = new ClassPathXmlApplicationContext("/homework013/config/spring-config.xml");
            User user = ac.getBean(User.class);

            user.setEmail("Ruben");
            user.setEmail("ruben1997@mai.ru");
        }
}
