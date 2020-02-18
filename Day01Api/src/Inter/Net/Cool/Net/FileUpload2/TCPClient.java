package Inter.Net.Cool.Net.FileUpload2;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class TCPClient {
    public static void main(String[] args) throws IOException {
        System.out.println("客户端开启，请求连接~");
        //1.创建一个本地字节输入流，构造方法中绑定要读取的数据源
        FileInputStream fis = new FileInputStream("D:\\新建文件夹\\test\\origin.jpeg");
        //2.创建一个socket对象，构造方法中绑定服务器的IP地址和端口号
        Socket socket = new Socket("127.0.0.1",8888);
        //3.使用socket对象的方法，getOutputStream获取一个网络字节输出流
        OutputStream os = socket.getOutputStream();
        //4.使用本地字节输入流的方法read，读取本地文件
        int len;
        byte[] bytes = new byte[1024];
        while((len = fis.read(bytes)) != -1){
            //5.使用网络字节输出流的方法write，将读取到的文件上传至服务器
            os.write(bytes,0,len);//写入不到结束标识，只能写入数据内容本身
        }
        //关闭输出流，通知服务器，写出数据完毕，于此同时发送给服务器一个结束标识
        socket.shutdownOutput();
        //6.使用socket对象中的方法，getInputStream获取一个网络字节输入流对象
        InputStream is = socket.getInputStream();
        //7.使用网络字节输入流的方法read来读取服务器回写的数据
        while((len = is.read(bytes)) != -1){
            System.out.println(new String(bytes,0,len));
        }
        System.out.println("已收到服务器发送的信息~");
        System.out.println("上传成功~");
        //8.释放资源
        fis.close();//自己创建的流
        socket.close();//关闭socket的同时，也会把与socket有关的流关闭
    }
}