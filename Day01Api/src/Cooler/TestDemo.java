package Cooler;

public class TestDemo {
    public static void main(String[] args) {
        Upper a = new Upper();
        method("hello", a::upCase);
    }

    public static void method(String s,Prin p){
        p.print(s);
    }
}
