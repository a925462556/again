package Cooler.Demo950;

public class DemoT {
    public static void main(String[] args) {
        Mm(-5, Math::abs);
    }

    public static void Mm(int num,Cal c){
        System.out.println(c.ab(num));
    }
}
