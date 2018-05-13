package Test8;

public class Test8 {
    public static void main(String[] args) {
        //练习8.1
        Integer number1 = new Integer(156);
        System.out.println(number1.intValue());
        //练习8.2
        Character myChar1 = new Character('A');
        Character myChar2 = new Character('a');
        System.out.println(myChar1.equals(myChar2));
        myChar1 = Character.toLowerCase(myChar1);
        myChar2 = Character.toLowerCase(myChar2);

        System.out.println(myChar1.equals(myChar2));

        //练习8.3

    }
}
