

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArralistDuplicateElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list=new ArrayList<String>();
		
		list.add("Sachin");
		list.add("2222");
		list.add("Ashish");
		list.add("Kiran");
		list.add("raj");
		list.add("2222");
		list.add("raj");
		
		Set<String> set=new HashSet<String>();
		for(String name: list)
		{
			
			if(set.add(name)==false) 
			{
				System.out.println("The duplicate elements is: "+name);
			}
		
		}		
	}
}
