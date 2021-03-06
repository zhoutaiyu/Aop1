package com.cn;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

/**
 * Created by 周太宇 on 2017/10/13.
 */
//指定该类为切面类
@Aspect
public class Process {
    //统一定义切点
    @Pointcut("execution(* com.cn.Eat.eating(..))")
    public void eat(){}

    @Around("eat()")
    public void eating(ProceedingJoinPoint jp){
        try {
            System.out.println("端碗");
            jp.proceed();
            System.out.println("放筷子");
        }catch (Throwable e){
            e.printStackTrace();
        }
    }
    /*@Before("eat()")
    public void holdTheBowl(){
        System.out.println("端碗");
    }

    @AfterReturning("eat()")
    public void PutTheChopsticks(){
        System.out.println("放筷子");
    }
    */
}
