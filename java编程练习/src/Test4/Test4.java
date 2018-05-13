package Test4;

import java.util.Scanner;

public class Test4 {
    public static void main (String []args) {
        //练习4.1 判断奇偶数
        Scanner inNum = new Scanner(System.in);
        System.out.println("Please write a number: ");
        int num = inNum.nextInt();
        if ( num % 2 == 0 ) {
            System.out.println("This number " + num + " is a 偶数");
        }else {
            System.out.println("This number " + num + " is a 奇数");
        }

        //练习4.2 输出菱形

        System.out.println("菱形长度: ");
        int length = inNum.nextInt();

        writeRhombus(length);

        //练习4.3计算1+1/2!+1/3!+...+1/20!之和；

        int i = length;
        double jiFen = 0;
        while ( i > 0 ) {
            jiFen = (jiFen  +  1) * ( 1 / (double)i);
            i--;
        }
        System.out.println(jiFen);
    }

     public static void writeRhombus(int length) {
        for ( int i = 0; i < length; i++ ) {
            //输出空格数 length - i - 1  || i-length + 1 标准是i的大小是否大于等于length
            for(int j = 0; j < length - 1 - i; j++) {
                System.out.print(" ");
            }
            for(int m = 0; m < 2 * i + 1; m++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = length; i < 2 * length - 1; i++) {
            for ( int j = 0; j < i - length + 1; j++ ) {
                System.out.print(" ");
            }
            for ( int m = 0; m < 2 * ( 2 * length -1 -i ) - 1; m++ ) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
