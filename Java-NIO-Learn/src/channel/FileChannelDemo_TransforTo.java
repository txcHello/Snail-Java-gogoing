package channel;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;

/**
 * @Author Administrator
 * @Date 2022/8/26 19:45
 * @Version 1.0
 * Desc:
 *
 *
 */
public class FileChannelDemo_TransforTo {


    public static void main(String[] args) throws IOException {
        //创建FileChannel
        RandomAccessFile accessFile1 = new RandomAccessFile("d:\\atguigu\\01.txt", "rw");
        FileChannel fromChannel = accessFile1.getChannel();
        RandomAccessFile accessFile2 = new RandomAccessFile("d:\\atguigu\\02.txt", "rw");
        FileChannel toChannel = accessFile2.getChannel();


         // 将fromChannel 数据传入到 toChannel
        long size = fromChannel.size();
        fromChannel.transferTo(0,size,toChannel);
        accessFile1.close();
        accessFile2.close();
        System.out.println("结束");


    }
}
