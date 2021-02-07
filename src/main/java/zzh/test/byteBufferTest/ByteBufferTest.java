package zzh.test.byteBufferTest;

import java.nio.ByteBuffer;

/**
 * @author
 * @Package
 * @Description:
 * @date 2021/1/24 22:34
 */
public class ByteBufferTest {

    // Invariants: mark <= position <= limit <= capacity
    private int mark = -1;//标记位置，reset时需要
    private int position = 0;//当前读取
    private int limit;//读取的最大位置
    private int capacity;//buffer的容量

    public static void main(String[] args) {


        ByteBuffer buffer = ByteBuffer.allocate(48);

        buffer.put("123456".getBytes());

        buffer.flip();

        while(buffer.hasRemaining()){
            System.out.println((char) buffer.get());
        }
    }



}
