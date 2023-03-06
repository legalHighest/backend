package top.hjh.spring.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDITest {
    public static void main(String[] args) {
        //        配置文件路径
        String xmlPath="/applicationContext.xml";
//        从配置文件中读取配置好的bean,创建spring核心容器
        ApplicationContext ac=new ClassPathXmlApplicationContext(xmlPath);

//        读取配置好的bean
        UserService userService=(UserService) ac.getBean("userService");
        userService.say();
    }
}
