package temacurs5;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

import java.util.Arrays;
@Aspect
public class MyAspect {
    @Pointcut("execution(public * *(..))")
    private void anyPublicOperation() {}

    @Pointcut("execution(* loggable*(..))")
    private void anyLoggableMethod() {}

    @Before(value = "anyPublicOperation() || anyLoggableMethod()", argNames = "joinPoint")
    public void beforeCall(JoinPoint joinPoint) {
        System.out.println("Method Name :" + joinPoint.getSignature().toShortString() +
                "| Args => " + Arrays.asList(joinPoint.getArgs()));
    }

}
