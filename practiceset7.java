public class practiceset7 {
    //multiplication table of givren number
    static void mul(int h) {
        for (int k = 1; k <= 10; k++) {
            System.out.println(k * h);

        }
    }
//printing the pattern
        static void pattern(int m){
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < i + 1; j++) {
                    System.out.print("*");
                }
                System.out.println(" ");
            }
        }
        //printing the pattern
        static void pattern2(int n){
            for (int g = n; g >0; g--) {
                for (int l = 0; l < g; l++) {
                    System.out.print("*");
                }
                System.out.println(" ");
            }
        }
        //sum of natural no using recursion
        static int sum(int e){
            if (e == 1) {
                return 1;
            } else {
                return e + sum(e - 1);
            }
        }
        //avg of three numbers
        static int avg ( int a, int b, int p){
            return (a + b + p) / 3;
        }
        //conversion of degrees to faranhite
        static void feranhite ( float c){
            if (c == 0) {
                System.out.println("32 faranhite");
            } else {
                float u = (c * 9 / 5) + 32;
                System.out.println(u);
            }
        }
        //printing the pattern
        static void pattern3 ( int w){
            if (w > 0) {
                pattern3(w - 1);
                for (int i = 0; i < w; i++) {
                    System.out.print("*");
                }
                System.out.println("");
            }
        }
        //printing the pattern
        static void pattern4( int v){
            if (v > 0) {

                for (int s = v; s > 0; s--) {
                    System.out.print("*");
                }
                System.out.println(" ");
                pattern4(v - 1);
            }
        }

        public static void main (String[]args){
            mul(5);


          pattern(4);
          pattern2(4);
          pattern3(4);
          pattern4(4);
          int z=sum(4);
            System.out.println(z);
             System.out.println(avg(5,4,3));
             //sum of the numbers iteratively
            int sum=0;
            for(int i=0;i<5;i++){
               sum+=i;

             }
              System.out.println(sum);
             feranhite(45);

        }
    }

