package Test3;

import java.util.Scanner;

public class Test3 {
    //练习3.2 区别类成员变量和局部变量，并加以说明

    static String s1 = "你好"; //成员方法可调用，可供外包引用之后的类成员调用
    public static void  main (String[] args) {
        String s2 = "world"; //函数局部变量只能供于main函数内使用，作用域无法向上延伸

        //练习3.1 输出两个变量的和

        int firstNum = 3;
        double secondNum = 3.0;
        System.out.println("firstNum + secondNum的结果是; " + (firstNum + secondNum));

        //练习3.3  将所有整形数据全部转换成int类型并输出结果

        byte b1 = 1;
        short sh1 = 43;
        int i1 = 2;
        long l1 = 34;
        System.out.println((int)b1);
        System.out.println((int)sh1);
        System.out.println(i1);
        System.out.println((int)l1);

        //测试数据，非练习数据 ， 练习输入输出
        Scanner inNum = new Scanner(System.in);
        System.out.println("Please write a number: ");
        int num = inNum.nextInt();
        System.out.println("the num is: " +  num);

    }
}
