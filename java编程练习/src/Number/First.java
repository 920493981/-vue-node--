package Number;

public class First {
    static String s1 = "你好"; //成员方法可调用，可供外部类调用
    public static void main (String []args) {
        String s2 = "world";//函数局部变量只能供于函数内使用，作用域无法向上延伸
        System.out.println(s1);
        System.out.println(s2);

        for (int i = 0; i < 20; i++) {
            if( i % 2 == 0 ){
                continue;
            }
            System.out.println(i);
        }

    }
}
