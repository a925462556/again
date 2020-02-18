package Date.Eee.LambdaPart.Fileclass;

import java.io.File;
import java.io.IOException;

public class Test1014 {

    public static void main(String[] args) throws IOException {
        File one = new File("D:\\新建文件夹\\test");
        String[] list = one.list();
        for (String s : list) {
            System.out.println(s);
        }
        //1.txt
        //aa
        //abc.txt
        //cool

        File two = new File("D:\\新建文件夹\\test");
        File[] files = two.listFiles();
        for (File file : files) {
            System.out.println(file);
        }
        //D:\新建文件夹\test\1.txt
        //D:\新建文件夹\test\aa
        //D:\新建文件夹\test\abc.txt
        //D:\新建文件夹\test\cool
    }
}
