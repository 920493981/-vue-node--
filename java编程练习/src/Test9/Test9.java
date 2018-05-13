package Test9;

import java.math.BigDecimal;

public class Test9 {

    public static int GetEventNum(double num1, double num2) {
        int s = (int)num1 + (int)(Math.random()*(num2 - num1));
        if(s % 2 == 0) {
            return s;
        } else {
            return s + 1;
        }
    }

    public static void main(String[] args) {
        int sixnumSum = 0;
        int i, randomNum;
        for (i = 0; i < 6; i++) {
            randomNum = GetEventNum(2, 32);
            System.out.print("第 " + (i + 1) + " 个数是: " + randomNum + "\n");
            sixnumSum += randomNum;
        }
        System.out.println("六个偶数之和是: " + sixnumSum);


    }
}
