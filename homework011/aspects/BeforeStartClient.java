package homework011.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * Created by rubenahmadiev on 25.03.16.
 */
@Aspect
public class BeforeStartClient {

    @Before("execution(* homework011.java.game.Client.run(..))")
    public void loggingClient(JoinPoint joinPoint) {
        System.out.println("method " + joinPoint.getSignature().getName() + " is running");
    }
}
