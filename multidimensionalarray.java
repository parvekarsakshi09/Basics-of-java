public class multidimensionalarray {
    public static void main(String[] args) {
        int[][]marks=new int[2][3];
        marks[0][0]=100;
        marks[0][1]=200;
        marks[0][2]=300;
        marks[1][0]=400;
        marks[1][1]=500;
        marks[1][2]=600;
        System.out.println(marks[1][2]);
        for(int i=0;i<marks.length;i++){
            for(int j=0;j<marks[i].length;j++) {
                System.out.print(marks[i][j]);
                System.out.print("   ");
            }


            System.out.println("");
        }

    }
}
