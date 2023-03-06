package top.hjh.spring.ioc.instance.static_factory;

/**
 * @Author huang
 * @Description 静态工厂实例化
 * @Date 2023 03 06 19 55
 **/
public class MyBean2Factory {
    public  static  Bean2 createBean(){
        return  new Bean2();
    }//返回第二类型的实例
}
