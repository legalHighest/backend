package top.hjh.spring.ioc.assemble;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author huang
 * @Description
 * @Date 2023 03 06 21 08
 **/
public class XmlBeanAssembleTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("classpath:beans5.xml");
        System.out.println(   applicationContext.getBean("user1",User.class));
        System.out.println(   applicationContext.getBean("user2",User.class));

    }
}
