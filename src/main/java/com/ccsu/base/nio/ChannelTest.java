package com.ccsu.base.nio;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.Channel;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Xiaolei Zhu
 * @Date: 2018/9/24
 * @Time: 19:01
 * Description: JavaNIO编程模型：Channel/Selector/Buffer
 * 参考：https://blog.csdn.net/qq_27093465/article/details/79657434
 */
public class ChannelTest {

    public void exportToFile(String path) throws IOException {
        File file = new File(path);
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        Channel channel = fileOutputStream.getChannel();
        ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
        String string = "123";
        byteBuffer.put(string.getBytes());
        byteBuffer.flip();
        //channel.write(byteBuffer);
        channel.close();
        fileOutputStream.close();
    }
}
