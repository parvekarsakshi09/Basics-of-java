public class array {
    public static void main(String[]args){
//      int[] [] marks = new int [2][3];
int []marks={2,3,5,6,1};
String []name={"sakii","ranii","sangu"};
      /*  marks[0]=12;
       marks[1]=1;
         marks[2]=172;
         marks[3]=121;
         marks[4]=865;*/
        System.out.println(marks[2]);
        System.out.println(marks.length);
        System.out.println(name.length);
        System.out.println(name[1]);
       for(int i=0;i<marks.length;i++){
          System.out.println(marks[i]);
       }

        for(int i1=marks.length-1;i1>=0;i1--){
            System.out.println(marks[i1]);
        }
    for(int element:marks){
        System.out.println(element);
    }
    }
}
