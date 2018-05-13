package Test5;

import java.util.Scanner;

public class Test5 {
    public static void main (String []args) {
        //练习5.1 使用String类的toUpperCase()方法和toLowerCase()方法实现大小写的转换
        System.out.println("练习5.1 使用String类的toUpperCase()方法和toLowerCase()方法实现大小写的转换");
        String testString = new String("This is a test String! The Origin words");
        System.out.println("the origin words are: " + testString);

        String upperString = testString.toUpperCase();
        System.out.println("the upper words are: " + upperString);

        String lowerString = testString.toLowerCase();
        System.out.println("the lower words are: " + lowerString);


        //练习5.2 判断手机号码
//        System.out.println("练习5.2 判断手机号码");
//        String regExp = "0?(13|14|15|17|18|19)[0-9]{9}";
//
//        Scanner inString = new Scanner(System.in);
//        System.out.print("Please write a numberString: ");
//        String numberString = inString.nextLine();
//        if(numberString.matches(regExp)) {
//            System.out.println("This is a true numberString");
//        } else {
//            System.out.println("This is a false numberString");
//        }


        //练习5.3 用字符串生成器，在字符串后面追加1-10 这10个数字
        System.out.println("练习5.3 用字符串生成器，在字符串后面追加1-10 这10个数字");
        StringBuilder str = new StringBuilder("This is the numString: ");
        for( int i = 1; i <= 10; i++) {
            str.append(i);
        }
        System.out.println(str);

    }
}
