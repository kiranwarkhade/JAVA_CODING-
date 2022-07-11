public class StringRemoveSpace {

    public static void main(String[] args) {
        

    
    String s1="Hello      World !!";
    String s2="";
    int l=s1.length();
     for(int i=0;i<l;i++)
        {
        if(s1.charAt(i)!=' ')
                 s2=s2+s1.charAt(i);
        else
             continue;
        }
    System.out.print(s2); 
}
}