public class recursion {
    static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return (n * factorial(n - 1));
        }
    }
    static int iterative(int x){
        if (x == 0 || x == 1) {
            return 1;
        }
        else {
            int fact=1;
            for(int i=1;i<=x;i++){
                fact *= i;
            }
            return fact;
        }


    }
  static  int fibonacci(int a){
      if(a==0){
          return 0;
      }
      if(a==1){
          return 1;
      }
      else{
          return (fibonacci(a-1)+fibonacci(a-2));
      }
    }

      public static void main(String[] args) {
        int x=4;
          int n=10;
        int a1=0;
        int b1=1;

        System.out.println(iterative(x));
        System.out.println(factorial(n));
        //iterative implementation of fibonacci
     for(int i=2;i<n;i++) {
    int c1=a1+b1;
       a1=b1;
      b1=c1;
    System.out.println(c1);
     }
     //recursive implementation of fibonacci
     for(int m=0;m<n;m++) {
    System.out.println(fibonacci(m));
}
    }
}
