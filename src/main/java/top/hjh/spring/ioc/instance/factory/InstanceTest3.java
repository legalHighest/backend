package top.hjh.spring.ioc.instance.factory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import top.hjh.spring.ioc.instance.constructer.Bean1;

/**
 * @Author huang
 * @Description
 * @Date 2023 03 06 20 09
 **/
public class InstanceTest3 {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("classpath:beans3.xml");
       Bean3 bean3=applicationContext.getBean("bean3",Bean3.class);
        System.out.println(bean3);


    }
}
