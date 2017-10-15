package com.cn;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by 周太宇 on 2017/10/13.
 */
//支持切面代理
@EnableAspectJAutoProxy
//Bean的扫描器
@ComponentScan
//声明为配置类
@Configuration
public class EatConfig {
    @Bean
    public Process getProcess(){
        return new Process();
    }
    //由于Eat接口下有两个实现类，需按名称找Bean，定义Bean的名称
    @Bean(name = "eatingRice")
    public Eat getRice(){
        return new EatingRice();
    }

    @Bean(name = "eatingNoodle")
    public Eat getNoodle(){
        return new EatingNoodle();
    }
}
