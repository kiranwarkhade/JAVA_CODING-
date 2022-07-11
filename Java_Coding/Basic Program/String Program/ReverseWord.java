

import java.util.regex.Pattern;
public class ReverseWord {


	static String reverseWords(String str)
	{

		
		Pattern pattern = Pattern.compile("\\s");

	
		String[] temp = pattern.split(str);
		String result = "";

		
		for (int i = 0; i < temp.length; i++) {
			if (i == temp.length - 1)
				result = temp[i] + result;
			else
				result = " " + temp[i] + result;
		}
		return result;
	}

	
	public static void main(String[] args)
	{
		String s1 = "Welcome to Pune";
        System.out.println(s1+": ");
		System.out.println(reverseWords(s1));
         System.out.println("__________________");
		String s2 = "I love Java Programming";
        System.out.println(s2+": ");
		System.out.println(reverseWords(s2));
	}
}
