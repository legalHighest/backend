package top.hjh.spring.ioc.instance.static_factory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author huang
 * @Description
 * @Date 2023 03 06 20 02
 **/
public class InstanceTest2 {
    public static void main(String[] args) {
        ApplicationContext context2 = new ClassPathXmlApplicationContext("classpath:beans2.xml");
        Bean2 bean2 = (Bean2) context2.getBean("bean2", Bean2.class);
        System.out.println(bean2);
    }
}
