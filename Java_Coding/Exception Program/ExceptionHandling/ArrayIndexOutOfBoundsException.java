package Exception;

import java.util.Random;

public class ArrayIndexOutOfBoundsException {

	public static void main(String[] args) {
		
		Random r=new Random();
		int[]  a={1,2,3,4,5,6,7,8,9};
		int i;
		
		try {
			System.out.println("Array contains");
		for( i=0;i<=59;i++)
		{
			System.out.println(a[i]);	
	    }
	 }
		catch(Exception e)
		{
			System.out.println("Array Index Out of Bound Exception");
		}
		System.out.println("End of Program");
		

	}

}
