

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApi {

	public static void main(String[] args) {
		
	//	int i;
		List<String> name=new ArrayList<String>();
		name.add("Kiran");
		name.add("Sachin");
		name.add("Ram");
		name.add("Sham");
		
		Stream<String> str=name.stream();
		System.out.println(str.count());

		List<Integer> list=List.of(2,4,6,8,22,234,55);
	List<Integer> list1=list.stream().filter( i -> i % 2==0).collect(Collectors.toList());
	System.out.println(list);  
	
	//name.forEach((k)-> System.out.println(k));

	}

}
