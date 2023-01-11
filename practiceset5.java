public class practiceset5 {
    public static void main(String[] args) {
        //printing the star pattern using for loop
        for (int i = 4; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        //addn of first 4 even numbers using while loop
        int j=0,sum=0;
        while(j<4){
            System.out.println(2*j);

            sum=sum+(2*j);
            j++;
        }
        System.out.println(sum);
        //sum of all elements in multiplication table of 8
        int n=8,sumo=0;
        for(int m=1;m<=10;m++){
           sumo=sumo+n*m;
        }
        System.out.println(sumo);
        //printing table of 4 in reverse order
        int o=4;
        for(int p=10;p>0;p--){
            System.out.println(p*o);
        }
        //calculating factorial of 5 using for loop
        int fact=1;
       for(int v=1;v<=5;v++){
         fact=fact*v;
       }
        System.out.println(fact);
       //find factorial using while loop
       int facto=1;
         int u=1;
       while(u<=5) {
         facto=facto*u;
         u++;
          }

        System.out.println(facto);
        //sum of n even numbers using for loop
        int sumji=0;
        for(int l=0;l<4;l++){
          sumji=sumji+(2*l);
            }
        System.out.println(sumji);
    }
}
