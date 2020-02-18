package Cooler.Demo950.ThisDemo;

public class Husband {
    public void marry(Rich rich){
        rich.buy();
    }

    public void buyHouse(){
        System.out.println("买套房子");
    }

    public void beHappy(){
        marry(() -> this.buyHouse());
        marry(this::buyHouse);//等效于上面的lambda表达式
    }

    public static void main(String[] args) {
        new Husband().beHappy();
    }
}
