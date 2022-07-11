

import java.util.Scanner;

public class AverageMarksOf_5_Subjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a,b,c,d,e;
		System.out.println("Enter marks of five subjects:");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		d=sc.nextInt();
		e=sc.nextInt();
		
		int sum=a+b+c+d+e;
		System.out.println("Total marks of: "+ sum);
		double avg=sum/5.0;
		System.out.println("Average marks:"+avg);
		
	}

}
