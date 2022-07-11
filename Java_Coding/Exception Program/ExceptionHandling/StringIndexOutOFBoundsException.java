package Exception;

public class StringIndexOutOFBoundsException {

	public static void main(String[] args) {
		
		try {
		String s="This is String";
		char c=s.charAt(22);
		System.out.println(c);
		System.out.println(s.length());
		}
		catch(StringIndexOutOfBoundsException e)
		{
			e.printStackTrace();
			System.out.println("String Index Out of Bound Exception");
		}
	}

}
