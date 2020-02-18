package Inter.Net.Cool.Net.FileUpload;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
    public static void main(String[] args) throws IOException {
        System.out.println("服务器开启，等待连接~");
        //1.创建一个服务器ServerSocket对象，和系统要指定的端口号
        ServerSocket serverSocket = new ServerSocket(8888);
        //2.使用ServerSocket对象的方法accept,获取请求的socket对象
        Socket socket = serverSocket.accept();
        //3.使用socket对象中的方法获取一个网络字节输入流对象
        InputStream is = socket.getInputStream();
        //4.判断服务器的输出文件夹是否存在
        File a = new File("D:\\新建文件夹\\Server");
        if(!a.exists()){
            //如果不存在，创建所有需要的文件夹
            a.mkdirs();
        }
        //5.创建一个本地字节输出流对象，构造方法中绑定要输出的目的地
        FileOutputStream fos = new FileOutputStream("D:\\新建文件夹\\Server\\a.jpeg");
        //6.使用网络字节输入流的方法read,读取客户端上传的文件
        byte[] bytes = new byte[1024];
        int len;
        while((len = is.read(bytes)) != -1){//如果客户端不使用shutdown方法，使得is读取到结束标识，read方法将进入阻塞状态
            //7.使用本地字节输出流对象的方法write，将读取到的文件保存到服务器的硬盘上
            fos.write(bytes,0,len);//写入的内容只包括有效内容，不包括结束符号
        }
        //8.使用socket对象获取网络字节输出流对象
        OutputStream os = socket.getOutputStream();
        //9.使用网络字节输出流对象，给客户端回写“上传成功”
        os.write("上传成功！".getBytes());//写入标识该字符串的字节，包括了结束标识
        //10.释放资源
        fos.close();
        socket.close();
        serverSocket.close();
    }
}