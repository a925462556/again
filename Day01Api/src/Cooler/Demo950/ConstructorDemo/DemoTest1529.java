package Cooler.Demo950.ConstructorDemo;

public class DemoTest1529 {
    public static void main(String[] args) {
        //1.匿名内部类，重写了抽象方法
        printName("马儿扎哈", new PersonBulider() {
            @Override
            public Person builder(String s) {
                return new Person(s);
            }
        });
        //2.lambda表达式，标准写法
        printName("马尔扎哈", (String s) -> {
            return new Person(s);
        });
        //3.lambda表达式，省略写法
        printName("马儿扎哈",s -> new Person(s));
        //4.构造器引用写法
        printName("马儿扎哈",Person::new);
    }

    public static void printName(String name,PersonBulider pb){
        System.out.println(pb.builder(name));//对象类型：Person{name='马儿扎哈'}
    }
}
