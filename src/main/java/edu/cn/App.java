package edu.cn;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context;
        context=new AnnotationConfigApplicationContext(PerformanceConfig.class);
        Performance ballet=context.getBean(Performance.class);
        ballet.perform();
    }
}
