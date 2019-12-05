package chapter01.demo3_1_12;

import java.io.IOException;
import java.io.PipedInputStream;

/**
 * @ClassName ReadData
 * @Author LinBin
 * @Date 2019/12/5 14:15
 * @Description :
 */
public class ReadData {
    public void Read(PipedInputStream in){
        try {
            System.out.println("Read:");
            byte[] bytes = new byte[2048];
            int readLength = in.read(bytes);
            //没有数据时会阻塞,直到有数据
            while (readLength != -1){
                String newData = new String(bytes,0,readLength);
                System.out.print(newData);
                readLength = in.read(bytes);
            }
            System.out.println();
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
