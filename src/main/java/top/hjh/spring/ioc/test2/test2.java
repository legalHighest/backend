package top.hjh.spring.ioc.test2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import top.hjh.spring.ioc.test1.Dog;

public class test2 {
    public static void main(String[] args) {
        //        配置文件路径
        String xmlPath="/applicationContext.xml";
//        从配置文件中读取配置好的bean,创建spring核心容器
        ApplicationContext ac=new ClassPathXmlApplicationContext(xmlPath);

//        读取配置好的bean
       Book book1=(Book)ac.getBean("Book1");
        Book book2=(Book)ac.getBean("Book2");
    }
}
