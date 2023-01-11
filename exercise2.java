import java.sql.SQLOutput;
import java.util.Scanner;
public class exercise2 {
    public static void main(String[] args) {

        int com = 0;
        int me = 0;
        int game = 1;
        //1->stone
        //2->paper
        //3->scissor
        System.out.println("1.stone\n2.paper\n3.scissor");
        while (game <= 5) {
            System.out.println("enter the choice of user");
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            System.out.println("enter the choice of computer");
            Scanner sca = new Scanner(System.in);
            int csch = sca.nextInt();
            if (choice == 1 && csch == 2) {
                System.out.println("computor won");
                com++;


            } else if (choice == 1 && csch == 3) {
                System.out.println("user won");
                me++;


            } else if (choice == 2 && csch == 3) {
                System.out.println("computor won");
                com++;


            } else if (choice == 2 && csch == 1) {
                System.out.println("computor won");
                com++;

            } else if (choice == 3 && csch == 1) {
                System.out.println("computor won");
                com++;

            } else if (choice == 3 && csch == 2) {
                System.out.println("user won");
                me++;

            } else {
                System.out.println("draw");
            }


            if (game == 5) {

                break;
            }
            game++;
        }
        System.out.println("comuter has got"+com);
        System.out.println("me got"+me);
        if(com>me){
            System.out.println("computer won the series");
        }
        else if(me>com) {
            System.out.println("user won this series");
        }
        else {
            System.out.println("series has drawn");
        }
    }


}
