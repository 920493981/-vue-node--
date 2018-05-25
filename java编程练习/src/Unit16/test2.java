package Unit16;

import java.lang.reflect.Field;
import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        example_1 example = new example_1();
        Class exampleC = example.getClass();
        Field[] field = exampleC.getDeclaredFields();
        //用户输入名字和密码
        Scanner in = new Scanner(System.in);
        System.out.print("Please write your name: ");
        String name = in.nextLine();
        System.out.print("Please write your password; ");
        String password = in.nextLine();
        String username = "";
        String userPassword = "";
        try{
            username = (String) field[0].get(example);
            userPassword = (String) field[1].get(example);
            System.out.print("The to name & password: " + name + " &" + password + "\n");
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
        if( !name.equals( username ) && !password.equals( userPassword ) ){
            System.out.print("The error is up to name & password: " + name + " &" + password + "\n");
        }else if( !password.equals( userPassword ) ){
            System.out.print("The error is up to password: " + password + "\n");
        } else if( !name.equals( username ) ) {
            System.out.print("The error is up to name: " + name + "\n");
        }else {
            System.out.print("successful symbols!\nthe name and password are right!\n");
        }
    }
}
