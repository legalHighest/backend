package top.hjh.spring.ioc.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.swing.plaf.synth.SynthOptionPaneUI;

/**
 * @Author huang
 * @Description 生命周期
 * @Date 2023 03 06 20 16
 **/
public class ScopeTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("classpath:scopebeans.xml");

//        每次都使用同一个实例
        System.out.println(applicationContext.getBean("scope1"));
        System.out.println(applicationContext.getBean("scope1"));
        System.out.println("-----------------------------------------");



        //        每次使用都会创建一个新的实例
        System.out.println(applicationContext.getBean("scope2"));
        System.out.println(applicationContext.getBean("scope2"));



    }
}
