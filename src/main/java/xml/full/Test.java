package xml.full;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by 周太宇 on 2017/10/13.
 */
public class Test {
    public static void main(String[] args) {
        ApplicationContext context;
        context =new ClassPathXmlApplicationContext("classpath:applicationContext2.xml");
        //取Bean
        Eat eatingRice =(Eat) context.getBean("eatingRice");
        //执行业务
        eatingRice.eating();
        System.out.println("___________________");
        Eat eatingNoodle =(Eat) context.getBean("eatingNoodle");
        eatingNoodle.eating();
    }
}