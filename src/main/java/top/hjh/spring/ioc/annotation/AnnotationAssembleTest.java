package top.hjh.spring.ioc.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author huang
 * @Description 基于Annotation的装配
 * @Date 2023 03 06 21 27
 **/
public class AnnotationAssembleTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("/beans6.xml");
        UserController userController=(UserController) applicationContext.getBean("userController");
        userController.save();
    }
}
