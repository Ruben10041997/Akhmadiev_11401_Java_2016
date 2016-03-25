package homework012;

import homework012.models.PerformClass;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by rubenahmadiev on 25.03.16.
 */
public class Main {

        public static void main(String[] args) {
            ApplicationContext context = new ClassPathXmlApplicationContext("/homework012/config/spring-config.xml");
            PerformClass obj = context.getBean(PerformClass.class);
            obj.execute("select * from cars");
    }

}
