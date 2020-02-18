package Cooler.Demo950.ArrayConstruct;

public class ArrayTest {
    public static int[] initArray(int length,ArrayBulider ab){
        return ab.buildArray(length);
    }

    public static void main(String[] args) {
        int[] arr = initArray(10, int[]::new);
        System.out.println(arr.length);
    }
}
