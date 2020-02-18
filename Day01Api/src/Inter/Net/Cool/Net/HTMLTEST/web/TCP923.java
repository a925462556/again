package Inter.Net.Cool.Net.HTMLTEST.web;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class TCP923 {
    /*
    创建一个B/S版本的服务器
     */
    public static void main(String[] args) throws IOException {
        //1.创建一个ServerSocket对象，和服务器要指定的端口号
        ServerSocket serverSocket = new ServerSocket(8080);

        //2.使用accept方法获取socket对象（浏览器）
        Socket socket = serverSocket.accept();

        //3.使用socket对象中的getInputStream方法，获取网络字节输入流
        InputStream is = socket.getInputStream();

        //4.使用网络字节输入流的方法read读取浏览器的请求信息
        byte[] bytes = new byte[1024];
        int len;
        /*while((len = is.read(bytes)) != -1){
            System.out.println(new String(bytes,0,len));
        }*/

        /*
        浏览器请求信息第一行
        GET /Day01Api/web/index.html HTTP/1.1
        //  Day01Api/web/index.html（浏览器想要请求的资源）
         */

        //使用字符串分割的方法得到想要的内容
        //网络字节输入流-->字节转换输入流-->字节缓冲转换输入流
        BufferedReader bf = new BufferedReader(new InputStreamReader(is));
        //使用字节缓冲输入流的方法readLine读取字节
        String requst = bf.readLine();
        //使用String的分割方法,按空格分割
        String[] strings = requst.split(" ");
        //创建一个子字符串，去掉前面的/
        String path = strings[1].substring(1);
        System.out.println(path);

        //5.创建一个本地字节输入流，构造方法中绑定路径
        FileInputStream fis = new FileInputStream(path);

        //6.使用socket对象的getOutputStream获取一个网络字节输出流对象
        OutputStream os = socket.getOutputStream();

        //固定写法：写入HTTP响应头
        os.write("HTTP/1.1 200 OK\r\n".getBytes());
        os.write("Content-Type:text/html\r\n".getBytes());
        //必须额外写入空行，否则服务器不解析
        os.write("\r\n".getBytes());

        //7.一读一写复制文件，把服务器读取的html文件回写回客户端
        len = 0;
        while((len = fis.read(bytes)) != -1){
            os.write(bytes,0,len);
        }

        //8.释放资源
        fis.close();
        socket.close();
        serverSocket.close();
    }
}
