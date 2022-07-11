

import java.util.Scanner;

//a number that is equal to the reverse of that same number is called a palindrome number. 
//For example, 121,3223,3553, 12321, et
public class palindromeNumber {

	public static void main(String[] args) {
	

		int n,c,r,s=0;
		System.out.println("Enter Any Number: ");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		c=n;
		while(n>0)
		{
			r=n%10;
			s=(s*10)+r;
			n=n/10;
		}
		if(c==s)
		{
			System.out.println("Palindrome nummber:"+ c);
			
		}else
		{
			System.out.println("Not Palindrome number: "+c);
		}
	}

}