

import java.util.Scanner;

public class ArmstrongNumber {

	// 0,1,153,370,371,407,1634, 8208 and 9474
    //For example: 153 = 1*1*1 + 5*5*5 + 3*3*3 // 153 is an Armstrong number.
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n, arm=0, rem,c;
		System.out.println("Enter any number: ");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		c=n;
		while(n>0)
		{
			rem=n % 10;
			arm=(rem*rem*rem)+arm;
			n=n/10;
		}
		if(c==arm)
		{
			System.err.println("armstrong number: "+c);
		}else
		{
			System.out.println("not armstrong number: "+c);
		}
	sc.close();	
	}

}
