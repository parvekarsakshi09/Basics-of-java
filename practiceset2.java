import java.util.Scanner;
public class practiceset2
{
    public static void main(String[] args) {
        float z=7/2f*9/2f;
        System.out.println(z);
        char grade='B';
        grade=(char)(grade+8);
        System.out.println(grade);
        grade=(char)(grade-8);
        System.out.println(grade);

      Scanner sc=new Scanner(System.in);
       int o=sc.nextInt();
       System.out.println(o>9);
        float u=10f,v=25f,s=5f,b=12f;
        float a=(v*v-u*u)/(2*b*s);
        System.out.println(a);

        int x=7*49/7+35/7;
        System.out.println(x);
    }
}
