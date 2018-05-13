package Test7;

public class truePeople {
    public static void main(String [] args) {
        //练习7.1
        System.out.println("练习7.1");
        People people = new People();
        people.setName("zoushijun");
        System.out.println(people.getName());

        //练习7.2
        System.out.println("练习7.2");
        Rectangle rectangle = new Rectangle(14,5);
        System.out.println("rectangle's area is : " + rectangle.rectArea());
    }

}
