package top.hjh.spring.ioc.test1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import top.hjh.spring.ioc.UserService;

public class testOne {
    public static void main(String[] args) {
        //        配置文件路径
        String xmlPath="/applicationContext.xml";
//        从配置文件中读取配置好的bean,创建spring核心容器
        ApplicationContext ac=new ClassPathXmlApplicationContext(xmlPath);

//        读取配置好的bean
        Dog dog=(Dog)ac.getBean("Dog");
        Cat cat=(Cat) ac.getBean("Cat");

        System.out.println(dog.toString());
        System.out.println(  cat.toString());
    }

}
