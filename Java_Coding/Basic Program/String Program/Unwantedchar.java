public class Unwantedchar {
    public static void main(String[] args) {
        String s="123-45-(678)-9";
       s= s.replaceAll( "[^a-zA-Z0-9]","");
       System.out.println(s);
    }
}

