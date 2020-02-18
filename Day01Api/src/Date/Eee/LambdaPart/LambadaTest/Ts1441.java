package Date.Eee.LambdaPart.LambadaTest;

public class Ts1441 {
    public static void main(String[] args) {
        //lambda
        invocook(() -> System.out.println("吃饭啦"));


        //接口的匿名内部实现类对象
        invocook(new Cook() {
            @Override
            public void cookFood() {
                System.out.println("吃饭啦");
            }
        });
    }

    public static void invocook(Cook cook) {
        cook.cookFood();
    }
}
