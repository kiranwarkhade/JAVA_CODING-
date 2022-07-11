import java.util.Scanner;

public class PalindromeString1 {
    public static boolean Palindrome(String a){
        if(a.length() == 0 || a.length() == 1){
          return true;
        } 
        if(a.charAt(0) == a.charAt(a.length()-1)){
          return Palindrome(a.substring(1, a.length()-1));
        }
          return false;
      }
      
      public static void main(String[]args){
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String string = inp.nextLine();
        if(Palindrome(string)){
          System.out.println(string + " is a palindrome");
        }
        else{
          System.out.println(string + " is not a palindrome");
        }        
      }
}
