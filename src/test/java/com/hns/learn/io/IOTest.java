package com.hns.learn.io;

import org.junit.Test;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.StandardCharsets;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/**
 * @author : hannasong
 * @version : v1.0
 * @date : Created in 9:15 上午 2019/9/27
 * @description : 学习IO/NIO;
 */
public class IOTest {

    final String bathPath = "/Users/sinosong/tempForder/";

    public static void main(String[] args) throws IOException {

        char c;
        // 使用 System.in 创建 BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("输入字符, 按下 'q' 键退出。");
        // 读取字符
        do {
            c = (char) br.read();
            System.out.println(c);
        } while (c != 'q');

    }

    @Test
    public void test01() {

        try (
                // 根据指定文件创建文件输入流
                FileInputStream fis = new FileInputStream(bathPath + "data/nio-data.txt");
                // 根据文件创建文件输出流，如果文件不存在，自动创建文件
                FileOutputStream fos = new FileOutputStream(bathPath + "data/nio-data-copy.txt");
                // 获取通道
                FileChannel inChannel = fis.getChannel();
                FileChannel outChannel = fos.getChannel()
            )
            {
                // 分配指定大小的缓冲区
                ByteBuffer buffer = ByteBuffer.allocate(48);
                // 写入到Buffer: 将通道中的数据读取到缓冲区中
                while (inChannel.read(buffer) != -1) {
                    // 切换成数据模式
                    buffer.flip();
                    // 从Buffer读取: 将缓冲区中的数据写入到通道中
                    outChannel.write(buffer);///read from buffer into channel.
                    // 清空缓冲区
                    buffer.clear();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
    }

    /**
     * 向Buffer中写数据==
     * 从Channel写到Buffer。
     * 通过Buffer的put()方法写到Buffer里。
     * 从Buffer中读取数据==
     * 从Buffer读取数据到Channel。
     * 使用get()方法从Buffer中读取数据。
     */
    @Test
    public void test02() {

        try(
            RandomAccessFile aFile = new RandomAccessFile(bathPath + "data/nio-data.txt", "rw");
            FileChannel inChannel = aFile.getChannel();
            )
            {
                ByteBuffer buf = ByteBuffer.allocate(1024);
                int bytesRead = inChannel.read(buf);//read into buffer.
                while (bytesRead != -1) {
                    System.out.println("Read " + bytesRead);
                    //flip方法将Buffer从写模式切换到读模式。调用flip()方法会将position设回0，并将limit设置成之前position的值。
                    buf.flip();
                    //hasRemaining() 会在释放缓冲区时告诉你是否已经达到缓冲区的上界
                    while(buf.hasRemaining()){
                        System.out.print((char) buf.get());
                    }
                    buf.clear();
                    //处理完后继续从channel中读取数据,写入缓冲区，以便下次循环。
                    bytesRead = inChannel.read(buf);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
    }

    @Test
    public void test03() {

        try {
            // 通过设置字符集的编码，并将ByteBuffer转换为CharBuffer来避免中文乱码
            Charset charset = StandardCharsets.UTF_8;
            CharsetDecoder decoder = charset.newDecoder();

            RandomAccessFile file = new RandomAccessFile(bathPath + "data/nio-data.txt", "rw");
            FileChannel fileChannel = file.getChannel();

            ByteBuffer byteBuffer = ByteBuffer.allocate(5);
            CharBuffer charBuffer = CharBuffer.allocate(200);

            int bytesRead = fileChannel.read(byteBuffer);
            while (-1 != bytesRead) {
                System.out.println("Read " + bytesRead);
                byteBuffer.flip();
                while (byteBuffer.hasRemaining()) {
                    decoder.decode(byteBuffer, charBuffer, false);
                    charBuffer.flip();
                    System.out.print(charBuffer);
                }
                byteBuffer.clear();
                charBuffer.clear();
                bytesRead = fileChannel.read(byteBuffer);
            }
            fileChannel.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    /**
     * 缓冲区过小会异常 fixme
     */
    @Test
    public void test04() {
        try(
            RandomAccessFile aFile = new RandomAccessFile(bathPath + "data/nio-data.txt", "rw");
            FileChannel inChannel = aFile.getChannel();
        )
        {
            Charset charset = StandardCharsets.UTF_8;
            CharsetDecoder decoder = charset.newDecoder();
            ByteBuffer byteBuffer = ByteBuffer.allocate(5);
            CharBuffer charBuffer = CharBuffer.allocate(1024);
            while (inChannel.read(byteBuffer) != -1) {
                byteBuffer.flip();
                decoder.decode(byteBuffer, charBuffer, false);
                charBuffer.flip();
//                System.out.print(charBuffer);
                while(charBuffer.hasRemaining()){
                    System.out.print(charBuffer.get());
                }
                byteBuffer.compact();
                charBuffer.clear();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 内存文件映射 使用直接缓冲区复制；
     */
    @Test
    public void test05() {
        try(
           FileChannel inChannel = FileChannel.open(Paths.get(bathPath + "data/nio-data.txt"),
                   StandardOpenOption.READ);
           FileChannel outChannel = FileChannel.open(Paths.get(bathPath + "data/nio-data-copy.txt"),
                   StandardOpenOption.READ,StandardOpenOption.WRITE,StandardOpenOption.CREATE_NEW);
           ) {
            //内存映射文件（直接放入物理内存）
            MappedByteBuffer inMappedByteBuffer = inChannel.map(FileChannel.MapMode.READ_ONLY, 0, inChannel.size());
            MappedByteBuffer outMappedByteBuffer = outChannel.map(FileChannel.MapMode.READ_WRITE, 0, inChannel.size());
            //直接对缓冲区进行数据的读写操作
            byte[] dst = new byte[inMappedByteBuffer.limit()];
            inMappedByteBuffer.get(dst);
            outMappedByteBuffer.put(dst);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 通道之间传输；直接缓冲区
     */
    @Test
    public void test06() {
        try(
                FileChannel inChannel = FileChannel.open(Paths.get(bathPath + "data/nio-data.txt"),
                        StandardOpenOption.READ);
                FileChannel outChannel = FileChannel.open(Paths.get(bathPath + "data/nio-data-copy.txt"),
                        StandardOpenOption.READ,StandardOpenOption.WRITE,StandardOpenOption.CREATE_NEW);
        ) {
            inChannel.transferTo(0,inChannel.size(),outChannel);
//            outChannel.transferFrom(inChannel,0,inChannel.size());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testBuffer() {
        CharBuffer charBuffer = CharBuffer.allocate(100);

        charBuffer.put("abcde");

        System.out.println(charBuffer.position());
        System.out.println(charBuffer.limit());
        System.out.println(charBuffer.capacity());

        charBuffer.flip();
        System.out.println("charBuffer.length()="+charBuffer.length());
        System.out.println("charBuffer.limit()="+charBuffer.limit());
        charBuffer.position(charBuffer.limit());
        charBuffer.limit(charBuffer.capacity());
        charBuffer.put("1");
        charBuffer.flip();
        charBuffer.rewind();
//        System.out.println(charBuffer.position());
//        System.out.println(charBuffer.limit());
//        System.out.println(charBuffer.capacity());

//        System.out.println(charBuffer.limit(charBuffer.position()).position(0));
        System.out.println(charBuffer);
        System.out.println(charBuffer.get());
        System.out.println(charBuffer.get());
        System.out.println(charBuffer.get());
        System.out.println(charBuffer.position());
        System.out.println(charBuffer.limit());
        System.out.println(charBuffer.capacity());
    }
}
