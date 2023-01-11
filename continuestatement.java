public class continuestatement {
    public static void main(String[] args) {
        int i=0;
        while(i<5){
            i++;
            if(i==2){
                System.out.println("excellent");
                continue;
            }
            System.out.println(i);
            System.out.println("great");




        }
        int j=5;
        do{
            j++;
            if(j==9){
                System.out.println("ye hota kya Continue");
                continue;
            }
            System.out.println(j);
            System.out.println("print values");


        }while(j<14);
        for(i=0;i<5;i++){
            if(i==2){
                System.out.println("ab break hona");
                continue;
            }

            System.out.println("break in for lopp");
            System.out.println(i);

        }
    }
}
