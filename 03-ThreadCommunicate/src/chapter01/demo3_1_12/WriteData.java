package chapter01.demo3_1_12;

import java.io.IOException;
import java.io.PipedOutputStream;

/**
 * @ClassName WriteData
 * @Author LinBin
 * @Date 2019/12/5 14:03
 * @Description : 管道输出流
 */
public class WriteData {
    public void Write(PipedOutputStream out){
        try {
            System.out.println("Write:");
            for (int i = 1 ; i <= 200 ; i ++){
                String outData = " " + i;
                out.write(outData.getBytes());
                System.out.print(outData);
            }
            System.out.println();
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
