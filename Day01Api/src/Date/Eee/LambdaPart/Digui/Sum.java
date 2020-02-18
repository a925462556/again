package Date.Eee.LambdaPart.Digui;

import java.io.File;
import java.io.FileFilter;

public class Sum {
    public static void main(String[] args) {
        File a = new File("D:\\新建文件夹\\test");
        printFile(a);
    }

    public static void printFile(File a) {
        File[] files = a.listFiles(pathname -> pathname.getName().toLowerCase().endsWith(".txt") ||
                pathname.isDirectory());
        for (File file : files) {
            if(file.isFile()) {
                System.out.println("文件名：" + file);
            }
            if(file.isDirectory()) {
                printFile(file);
            }
        }
    }
}
