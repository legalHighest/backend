package top.hjh.spring.ioc.test4;

public class Pen {

    private  String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Pen{" +
                "name='" + name + '\'' +
                '}';
    }
}
