package Date.Eee.LambdaPart.Lambda2;

public class T1510 {
    public static void main(String[] args) {
        //匿名内部类
        invokeCalca(120, 130, (a, b) -> a + b);


    }

    public static void invokeCalca(int a,int b,Calculate calculate){
        int result = calculate.calc(a, b);
        System.out.println(result);
    }
}
