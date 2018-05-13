package Test9;

import java.math.BigDecimal;

public class BigDecimalDemo {
    public BigDecimal add(double value1, double value2) {
        BigDecimal b1 = new BigDecimal(Double.toString(value1));
        BigDecimal b2 = new BigDecimal(Double.toString(value2));
        return b1.add(b2);
    }
    public BigDecimal sub(double value1, double value2) {
        BigDecimal b1 = new BigDecimal(Double.toString(value1));
        BigDecimal b2 = new BigDecimal(Double.toString(value2));
        return b1.subtract(b2);
    }
    public BigDecimal div(double value1, double value2, int b) {
        if(b < 0){
            System.out.println("b值必须大于等于0");
        }
        BigDecimal b1 = new BigDecimal(Double.toString(value1));
        BigDecimal b2 = new BigDecimal(Double.toString(value2));

        return b1.divide(b2, b, BigDecimal.ROUND_HALF_DOWN);
    }
    public static void main(String[] args) {
        BigDecimalDemo b = new BigDecimalDemo();

        System.out.println(b.div(-7.5, 8.9, 6));
    }
}
