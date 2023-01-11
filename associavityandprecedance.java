import java.util.Scanner;
public class associavityandprecedance {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        boolean i=false;
        int p=sc.nextInt();
        int o=p%2;
        System.out.println(o);
        int u=9;
        u+=3;
        System.out.println(u);
        System.out.println(!i);
        System.out.println(2&3);
        float a=60/5-34*2;
        System.out.println(a);
        int c=6*5-34/2;
        System.out.println(c);
        int x=5,y=1,z=4;
        int b=(x-y)/2;
        System.out.println(b);
        int d=y*y-(4*x*z)/(2*x);
        System.out.println(d);

        char ch='a';
        int t=9;
        int s=ch+t;
        System.out.println(s);
        System.out.println(++ch);
        System.out.println(ch);
        System.out.println(ch++);
        System.out.println(ch);
    }
}
