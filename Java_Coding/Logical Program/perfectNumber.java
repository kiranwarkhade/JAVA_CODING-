

import java.util.Scanner;

public class perfectNumber {

	//only two number available 1 to 100.
	//6 ,28,496
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int n,sum=0;
		System.out.println("Enter Any Number: ");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		
		for(int i=1;i<n; i++)
		{
			if(n% i==0)
			{
				sum=sum+i;
			}
			
		}
		if(n==sum)
		{
			System.out.println("perfect nummber:"+ sum);
			
		}else
		{
			System.out.println("Not perfect number: "+sum);
		}
	}

	}

