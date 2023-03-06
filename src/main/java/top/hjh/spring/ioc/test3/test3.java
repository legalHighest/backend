package top.hjh.spring.ioc.test3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import top.hjh.spring.ioc.UserDao;

public class test3 {
    public static void main(String[] args) {
        //        配置文件路径
        String xmlPath="/applicationContext.xml";
//        从配置文件中读取配置好的bean,创建spring核心容器
        ApplicationContext ac=new ClassPathXmlApplicationContext(xmlPath);

//        读取配置好的bean
        Person person1 =(Person) ac.getBean("Person1");
        Person person2=(Person) ac.getBean("Person2");

        person1.dress();
        person2.dress();
    }
}
