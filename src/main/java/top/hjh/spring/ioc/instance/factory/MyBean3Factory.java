package top.hjh.spring.ioc.instance.factory;

/**
 * @Author huang
 * @Description 实例工厂方法实例化
 * @Date 2023 03 06 20 04
 **/
public class MyBean3Factory {
    public MyBean3Factory(){
        System.out.println("Beans工厂实例化");
    }

    public Bean3 createBean(){
        return  new Bean3();
    }
}
