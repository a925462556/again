package Date.Eee.LambdaPart.IOpart;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;


public class TestFileReader {
    public static void main(String[] args) throws IOException {
        //创建
        Properties a = new Properties();
        a.load(new FileReader("D:\\新建文件夹\\test\\属性集.txt"));
        Set<String> strings = a.stringPropertyNames();
        for (String string : strings) {
            System.out.println(string + "=" + a.getProperty(string));
        }
    }
}
