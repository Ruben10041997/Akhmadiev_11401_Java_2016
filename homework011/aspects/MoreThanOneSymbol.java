package homework011.aspects;


import homework011.java.game.Client;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

/**
 * Created by rubenahmadiev on 23.03.16.
 */

@Aspect
public class MoreThanOneSymbol {

    @Around("execution(* homework011.java.game.Client.run(..))")
    public Object symbErrors(ProceedingJoinPoint jp) throws Throwable {
     int symbAmount = jp.getArgs().length;

        if(symbAmount != 1)
            System.out.println("Неверные данные!!! Вы можете вводить только по одной букве!");



        return jp.proceed();

    }
}
