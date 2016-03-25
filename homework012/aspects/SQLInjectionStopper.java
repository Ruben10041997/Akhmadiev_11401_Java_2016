package homework012.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by rubenahmadiev on 25.03.16.
 */
@Aspect
public class SQLInjectionStopper {

        private Pattern pattern = Pattern.compile("~^\\s*(\\d+)\\s*$~i");

        @Around("execution(* *..*.execute(String))")
        public Object noSqlInjection(ProceedingJoinPoint jp) throws Throwable {
            String lang = (String) jp.getArgs()[0];
            Matcher matcher = pattern.matcher(lang);
            if (!matcher.matches()) {
                System.out.println("WARNING! Injection!");
                return null;
            }
            return jp.proceed();
        }
}
