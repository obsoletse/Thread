package chapter01.demo3_1_12;

import java.io.PipedOutputStream;

/**
 * @ClassName WriteThread
 * @Author LinBin
 * @Date 2019/12/5 14:25
 * @Description :
 */
public class WriteThread extends Thread {
    private WriteData writeData;
    private PipedOutputStream out;

    public WriteThread(WriteData writeData,PipedOutputStream pipedOutputStream){
        this.writeData = writeData;
        this.out = pipedOutputStream;
    }

    @Override
    public void run() {
        super.run();
        writeData.Write(out);
    }
}
