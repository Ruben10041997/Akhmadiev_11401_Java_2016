package homework013.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by rubenahmadiev on 25.03.16.
 */
@Aspect
public class ItsNotEmail {
    @Around("execution(* homework013.models.User.setEmail(..))")
    public Object checkEmail(ProceedingJoinPoint jp) throws Throwable {
        String email = (String) jp.getArgs()[0];
        Pattern pattern = Pattern.compile("[a-zA-Z]{1}[a-zA-Z\\d\\u002E\\u005F]+@([a-zA-Z]+\\u002E){1,2}((net)|(com)|(ru))",
                Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(email);

        if (!matcher.matches()) {
            System.out.println("You have entered not e-mail.");
            return null;
        }

        return jp.proceed();

    }
}
