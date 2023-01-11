import java.util.Scanner;
public class practiceset1 {
    public static void main(String[] args) {
        System.out.println("what is your name");
        Scanner sc=new Scanner(System.in);
         String name=sc.next();

        System.out.println("hello " +name+ " have a nice day");

        System.out.println("enter km");
        double km=sc.nextFloat();
        double miles;
        miles= 0.621 *km;
        System.out.println(miles);
        System.out.println("checking given no is integer or not");
        System.out.println(sc.hasNextInt());



    }


}
