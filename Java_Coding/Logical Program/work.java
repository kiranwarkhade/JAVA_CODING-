

import java.util.Scanner;

public class work {

	public static void main(String[] args) {
		
		System.out.println("Student info");
		Scanner sc=new Scanner(System.in);
		
		int id=sc.nextInt();
		String name=sc.next();
		String address=sc.next();
		System.out.println(id+"\n"+name+"\n"+address);
		sc.close();
		
	}
}
