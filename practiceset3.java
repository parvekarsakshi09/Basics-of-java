public class practiceset3 {
    public static void main(String[] args) {
        String str="i AM lOWer case";
        String s=str.toLowerCase();
        System.out.println(s);
        String text="she is my soulmate";
        String c=text.replace(" ","__");
        System.out.println(c);
        String ree="these contains double and  triple spaes";
        System.out.println(ree.indexOf("  "));
        System.out.println(ree.indexOf("   "));
        String wer="dear,<|name|> thankkk uuu";
        String moo=wer.replace("<|name|>","sakshu");
        System.out.println(moo);
        String we="dear,\n\tsakshiji\nthank uuu";
        System.out.println(we);

    }

}
