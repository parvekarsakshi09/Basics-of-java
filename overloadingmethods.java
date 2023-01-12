public class overloadingmethods {
   static void sum() {
        System.out.println("we will do sum");
      }
      static  void sum(int a) {

        System.out.println("good "+a+" bro");
         }
        static void sm(int b){
       b=342;
}
        static void change(int []arr){
       arr[0]=567;
        }
        static   void sum(int a, int b) {
        System.out.println("good "+a+" bro");
        System.out.println("good "+b+" bro");
    }

    public static void main(String[] args) {
     sum();
     sum(3000);
     sum(20,78);
      int x=54;
       sm(x);
        System.out.println(x);
         int []arr={1,6,8,2,24};
     change(arr);
        System.out.println(arr[0]);



    }
}
