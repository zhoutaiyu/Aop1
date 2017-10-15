package com.cn;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * Created by 周太宇 on 2017/10/13.
 */
//指定该类为切面类
@Aspect
public class Process {
    //统一定义切点
    @Pointcut("execution(* com.cn.Eat.eating(..))")
    public void eat(){}

    @Before("eat()")
    public void holdTheBowl(){
        System.out.println("端碗");
    }

    @AfterReturning("eat()")
    public void PutTheChopsticks(){
        System.out.println("放筷子");
    }
}
