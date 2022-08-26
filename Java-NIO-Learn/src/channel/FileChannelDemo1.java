package channel;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * @Author Administrator
 * @Date 2022/8/26 19:45
 * @Version 1.0
 * Desc:
 *
 *  将数据从文件读取数据
 */
public class FileChannelDemo1 {


    public static void main(String[] args) throws IOException {
        //创建FileChannel
        RandomAccessFile accessFile = new RandomAccessFile("d:\\atguigu\\01.txt", "rw");
        FileChannel channel = accessFile.getChannel();
        //创建Buffer
        ByteBuffer buffer = ByteBuffer.allocate(1024);

        //读取数据到buffer中
        int read = channel.read(buffer);

        while (read!=-1){
            System.out.println("读取了"+ read);
            buffer.flip();
            while (buffer.hasRemaining()){
                System.out.println((char)buffer.get() );
            }
            buffer.clear();
            read  = channel.read(buffer);
        }

        accessFile.close();
        System.out.println("结束");
    }
}
