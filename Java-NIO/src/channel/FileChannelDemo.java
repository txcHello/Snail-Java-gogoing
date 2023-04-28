package channel;

import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;

/**
 * @Author Administrator
 * @Date 2022/11/1 11:18
 * @Version 1.0
 * Desc:
 */
public class FileChannelDemo {
    @Test
    public void readChannelDemo() throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile("G:\\Snail-Java-gogoing\\default.txt","rw");
        FileChannel channel = randomAccessFile.getChannel();

        ByteBuffer allocate = ByteBuffer.allocate(1024);
        int read = channel.read(allocate);
        while (read != -1){
            System.out.println("read:"+read);
            allocate.flip();
            while (allocate.hasRemaining()){
                System.out.println((char)allocate.get() );
            }
            allocate.clear();
           read = channel.read(allocate);
        }
    }
    @Test
    public void writeChannelDemo() throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile("G:\\Snail-Java-gogoing\\output.txt","rw");
        FileChannel channel = randomAccessFile.getChannel();
        String  hello = "hello java";
        byte[] bytes = hello.getBytes(StandardCharsets.UTF_8);
        ByteBuffer allocate = ByteBuffer.allocate(1024);
        allocate.put(bytes);
         allocate.flip();
         while (allocate.hasRemaining()){
          channel.write(allocate);
         }
        randomAccessFile.close();
        channel.close();
    }

}
