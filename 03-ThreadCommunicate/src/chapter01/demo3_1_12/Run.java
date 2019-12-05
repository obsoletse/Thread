package chapter01.demo3_1_12;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

/**
 * @ClassName Run
 * @Author LinBin
 * @Date 2019/12/5 14:26
 * @Description :
 */
public class Run {
    public static void main(String[] args) throws IOException, InterruptedException {
        WriteData writeData = new WriteData();
        ReadData readData = new ReadData();
        PipedInputStream input = new PipedInputStream();
        PipedOutputStream out = new PipedOutputStream();
        input.connect(out);
        ReadThread readThread = new ReadThread(readData,input);
        WriteThread writeThread = new WriteThread(writeData,out);
        readThread.start();
        Thread.sleep(5000);
        writeThread.start();
    }
}
