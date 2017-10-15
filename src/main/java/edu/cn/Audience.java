package edu.cn;

import org.aspectj.lang.annotation.*;

/**
 * Created by k01 on 2017/10/13.
 */
@Aspect
public class Audience {
    //@Pointcut("execution(** edu.cn.Performance.perform(..))")
    @Pointcut("execution(* edu.cn.Performance.perform(..))")
    public void performance() {
    }

    @Before("performance()")
    public void comeIn() {
        System.out.println("观众进场");
    }

    @Before("performance()")
    public void closePhone() {
        System.out.println("关掉手机");
    }

    @AfterReturning("performance()")
    public void applaud() {
        System.out.println("观众鼓掌");
    }

    @AfterThrowing("performance()")
    public void exceptionHappen() {
        System.out.println("观众要求退票");
    }
}
