package xml.full;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

/**
 * Created by 周太宇 on 2017/10/13.
 */

public class Process {

    public void holdTheBowl(){
        System.out.println("端碗");
    }
    public void PutTheChopsticks(){
        System.out.println("放筷子");
    }
}
