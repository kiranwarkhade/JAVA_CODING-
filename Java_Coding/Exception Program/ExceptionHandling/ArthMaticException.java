package Exception;

public class ArthMaticException {

	public static void main(String[] args)  {
		
		//int a=(int) (10.0/0.0);
		//int b=0/10;
		try
		{
		 //  int a=(int) (10.0/0.0);
			int c=10/0;
			int b=0/10;
		}catch(ArithmeticException e)
		{
			//e.printStackTrace();
			System.out.println("ArithmeticException");
		}
		

	}

}
