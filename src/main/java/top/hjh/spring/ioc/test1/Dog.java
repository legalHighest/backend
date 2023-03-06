package top.hjh.spring.ioc.test1;

public class Dog {
    String name ;
    int age;


    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Dog() {

    }

    @Override
    public String toString() {
        return "name=" +name+"age="+age;
    }
}
