public class methodsinjava {

    static int sum(int x,int y) {
        int z;
        if (x > y) {
            z = x + y;
            System.out.println(z);
        } else {
            System.out.println(z = x + y * 2);

        }
        return z;
    }

    public static void main(String[]args){
        int a=6;int b=5;
        int c;
       sum(a,b);
        methodsinjava obj=new methodsinjava();
       c=obj.sum(a,b);


        int a1=2;
        int b1=3;
        int c1;
       sum(a1,b1);
    }
}
