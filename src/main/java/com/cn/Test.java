package com.cn;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by 周太宇 on 2017/10/13.
 */
public class Test {
    public static void main(String[] args) {
        ApplicationContext context;
        //创建注解配置类型的Spring容器
        context = new AnnotationConfigApplicationContext(EatConfig.class);
        //取Bean
        Eat eatingRice =(Eat) context.getBean("eatingRice");
        //执行业务
        eatingRice.eating();
        System.out.println("___________________");
        Eat eatingNoodle =(Eat) context.getBean("eatingNoodle");
        eatingNoodle.eating();
    }
}
