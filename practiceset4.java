import java.util.Scanner;
public class practiceset4 {
    public static void main(String[] args) {
         int age=12;
        if(age==12) {
            System.out.println("i am 11");
        }
Scanner sc=new Scanner(System.in);
        float a=sc.nextFloat();
        float b=sc.nextFloat();
        float c=sc.nextFloat();
        float avg=(a+b+c)/3f;
        if(avg>40&&a>33&&b>33&&c>33){
            System.out.println("you passed");
        }
        else{
            System.out.println("you are fail");
        }


        int day=4;
        switch (day){
            case 1-> System.out.println("monday");
            case 2-> System.out.println("tuesday");
            case 3-> System.out.println("wed");
            case 4-> System.out.println("thusday");
            case 5-> System.out.println("friday");
            case 6-> System.out.println("saturday");
            case 7-> System.out.println("sunday");
            default-> System.out.println("valid daliye");

        }
        String name="in";
        if(name.endsWith("org"))
        System.out.println("organization");
     if(name.endsWith("in"))
        System.out.println("Indian");
        if(name.endsWith("com"))
            System.out.println("commercial");

        float tax=0f;
        Scanner ssc=new Scanner(System.in);
        float income=ssc.nextFloat();
        if(income<2.5f){
            tax=tax+0;
        }
        else if(income>2.5f && income<=5f){
            tax=tax+0.05f*(income-2.5f);
        }
        else if(income>5f && income<=10f){
            tax=tax+0.05f*(5f-2.5f);
            tax=tax+0.2f*(income-5f);
        }
        else if(income>10f){
            tax=tax+0.05f*(5f-2.5f);
            tax=tax+0.2f*(10.0f-5f);
            tax=tax+0.3f*(income-10f);
        }
        System.out.println("tax="+tax);

        Scanner src=new Scanner(System.in);
        int year=src.nextInt();
        if(year%400==0||year%4==0){
            System.out.println("leap years");
        }
        else {
            System.out.println("non leap");
        }
    }

}