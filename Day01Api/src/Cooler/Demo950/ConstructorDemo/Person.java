package Cooler.Demo950.ConstructorDemo;

public class Person {
    private String name;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "对象类型：" + "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
