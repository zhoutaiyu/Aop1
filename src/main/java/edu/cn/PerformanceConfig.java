package edu.cn;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by k01 on 2017/10/13.
 */
@EnableAspectJAutoProxy
@Configuration
@ComponentScan
public class PerformanceConfig {
    @Bean
    public Audience getAudience(){
        return new Audience();
    }

    @Bean
    public Performance getBallet(){
        return new Ballet();
    }
}
