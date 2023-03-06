package top.hjh.spring.ioc.instance.constructer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import top.hjh.spring.ioc.instance.constructer.Bean1;
import top.hjh.spring.ioc.instance.static_factory.Bean2;


public class InstanceTest1 {
    public static void main(String[] args) {
//        两种方法都是  从配置文件中读取配置好的bean,创建spring核心容器，用于实例化类

        ApplicationContext context1 = new ClassPathXmlApplicationContext("classpath:beans1.xml");
        Bean1 bean1 = context1.getBean("bean1", Bean1.class);


        //2.        配置文件路径
        //        String xmlPath="/beans1.xml";
        //      从配置文件中读取配置好的bean,创建spring核心容器
        //        ApplicationContext ac=new ClassPathXmlApplicationContext(xmlPath);

        System.out.println(bean1);


    }
}
