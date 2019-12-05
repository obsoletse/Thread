package chapter01.demo3_1_12;

import java.io.PipedInputStream;

/**
 * @ClassName ReadThread
 * @Author LinBin
 * @Date 2019/12/5 14:23
 * @Description :
 */
public class ReadThread extends Thread {
    private PipedInputStream input;
    private ReadData readData;
    public ReadThread(ReadData readData , PipedInputStream pipedInputStream){
        this.readData = readData;
        this.input = pipedInputStream;
    }

    @Override
    public void run() {
        super.run();
        readData.Read(input);
    }
}
