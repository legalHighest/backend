package top.hjh.spring.ioc.test4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test4 {
    public static void main(String[] args) {
        String xmlPath="/applicationContext.xml";
//        从配置文件中读取配置好的bean,创建spring核心容器
        ApplicationContext ac=new ClassPathXmlApplicationContext(xmlPath);
        SchoolBag schoolBag=(SchoolBag) ac.getBean("SchoolBag");
        System.out.println(schoolBag.toString());

    }
}
