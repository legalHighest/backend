package top.hjh.spring.ioc.test3;

public class Person {
    String name;

    Clothes clothes;
    public Person() {
    }

    public Person(String name, Clothes clothes) {
        this.name = name;
        this.clothes = clothes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Clothes getClothes() {
        return clothes;
    }

    public void setClothes(Clothes clothes) {
        this.clothes = clothes;
    }

    void dress(){
        System.out.println(name+"爱穿"+clothes.getColor()+clothes.getStyle());
    }
}
