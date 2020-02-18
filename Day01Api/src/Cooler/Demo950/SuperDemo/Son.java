package Cooler.Demo950.SuperDemo;

public class Son extends Father{
    @Override
    public void sayHello() {
        System.out.println("子类打招呼：你好！");
    }

    public void method(Greet g){
        g.greet();
    }

    public void show(){
        //调用父类方法的第一种方式
        method(() -> new Father().sayHello());
        //调用父类方法的第二种方式
        method(() -> super.sayHello());
        //更简化
        method(super::sayHello);
    }

    public static void main(String[] args) {
        Son a = new Son();
        a.sayHello();
        a.show();
    }
}
