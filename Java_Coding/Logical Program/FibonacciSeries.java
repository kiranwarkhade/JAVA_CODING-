

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int term,a=0,b=1,c;
		System.out.println("Enter the number: ");
		Scanner sc=new Scanner(System.in);
		term=sc.nextInt();
		System.out.print( "Fibonacci Series: ");
		for(int i=1; i<=term; i++)
		{
			System.out.print(a+ " ");
			c=a+b;
			a=b;
			b=c;
		}
	}

}
