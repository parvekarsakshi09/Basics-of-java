import java.util.Scanner;
public class exercise1 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter marks of 1st sub");
        float a=s.nextFloat();
        System.out.println("enter marks of 2st sub");
        float b=s.nextFloat();
        System.out.println("enter marks of 3st sub");
        float c=s.nextFloat();
        System.out.println("enter marks of 4st sub");
        float d=s.nextFloat();
        System.out.println("enter marks of 5th sub");
        float e=s.nextInt();
        float cgpa=(a+b+c+c+d)/50;
        System.out.println(cgpa);
        float percentage=((a+b+c+d+e)/500.0f)*100;
        System.out.println(percentage);
    }
}
