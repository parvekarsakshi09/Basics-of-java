import java.sql.SQLOutput;

public class javamethods {
    public static void main(String[] args) {
        String name="      saKKshi               ";
        int value=name.length();
        System.out.println(value);
        String s=name.toLowerCase();
        System.out.println(s);
        String sa=name.toUpperCase();
        System.out.println(sa);
        String sak=name.trim();
        System.out.println(sak);
        String sw=name.replace('s','w');
        System.out.println(sw);
        String aa=name.replace("KK","rr");
        System.out.println(aa);
       String sub=sak.substring(2);
        System.out.println(sub);
        String subo=sak.substring(2,4);
        System.out.println(subo);

        System.out.println(name.endsWith("sa"));
        System.out.println(name.endsWith("  "));
        System.out.println(name.charAt(9));
        System.out.println(name.equals("      saKKshi               "));
        System.out.println(name.equalsIgnoreCase("      saKKshI               "));
       String modified="siddhant";
        System.out.println(modified.indexOf("ddh"));
        System.out.println(modified.indexOf("ant",3));
        System.out.println(modified.lastIndexOf("ha",5));
        System.out.println("i am escape sequence\" double quote");
    }
}
