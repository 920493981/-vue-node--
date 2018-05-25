package Test15;

import javax.swing.*;
import java.io.FileInputStream;

public class Test15_1 {
    public static void main(String[] args){
        byte[] b = new byte[2];
        try {
            FileInputStream file = new FileInputStream("./testfile/world.txt");
            ProgressMonitorInputStream in = new ProgressMonitorInputStream(null,"读取中",file);
            while (in.read(b) != -1) {
                String s = new String(b);
                System.out.print(s);
                Thread.sleep(10);
            }
            in.close();
        } catch(Exception e1) {
            e1.printStackTrace();
        }
    }
}
