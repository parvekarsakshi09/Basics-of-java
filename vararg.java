public class vararg {

   /* static int sum(int a,int b){
        return a+b;
    }
    static int sum(int a,int b,int c){
        return a+b+c;
    }
    static int sum(int a,int b,int c,int d){
        return a+b+c+d;
    }*/
   static int sum(int...arr){
        int result=0;
        for(int element:arr){
            result +=element;
        }
        return result;
    }

    public static void main(String[]args){
        System.out.println(sum(3,4));
        System.out.println(sum(2,1,2));
        System.out.println(sum(1,4,2,6));


    }
}
