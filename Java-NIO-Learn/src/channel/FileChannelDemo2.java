package channel;

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
 *  通过fileChannel  向文件写数据
 */
public class FileChannelDemo2 {


    public static void main(String[] args) throws IOException {
        //创建FileChannel
        RandomAccessFile accessFile = new RandomAccessFile("d:\\atguigu\\02.txt", "rw");
        FileChannel channel = accessFile.getChannel();
        //创建Buffer
        ByteBuffer buffer = ByteBuffer.allocate(1024);

        String  newData ="data bigdata";

        buffer.put(newData.getBytes());

            buffer.flip();
            // filechannel 完成最终实现


        while (buffer.hasRemaining()){
            channel.write(buffer);
        }
        //关闭
        accessFile.close();

        channel.close();

    }
}
