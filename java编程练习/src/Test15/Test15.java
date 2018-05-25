package Test15;

import javax.swing.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.util.Scanner;

public class Test15 {
    public static void main(String[] args) throws Exception{
        byte[] b = new byte[2];

        FileInputStream file = new FileInputStream("./testfile/user.txt");

        FileWriter out = new FileWriter("./testfile/user.txt",true);

        Scanner in = new Scanner(System.in);
        System.out.print("请输入用户名: ");
        String insertword = in.nextLine();
        out.write(insertword + "\n");
        System.out.print("密码: ");
        in.nextLine();
        out.write(insertword + "\n");

        out.close();
        System.out.println();

        while (file.read(b) != -1) {

        }String s = new String (b);
        System.out.print(s);

        file.close();
    }
}
