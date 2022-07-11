import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class StreamMain
{
    public static void main(String[] args) {
        
        List<Integer> list1=List.of(2,4,6,50,21,22,69);
        System.out.println("List One is printed: "+list1);
        System.out.println("_______________________________________________");

        List<Integer> list2=new ArrayList<>();
        list2.add(20);
        list2.add(21);
        list2.add(22);
        list2.add(23);
        list2.add(24);
       System.out.println("List Two is printed: "+list2);
       System.out.println("_________________________________________________");

       List<Integer> list3=Arrays.asList(11,22,33,44,55);
       System.out.println("List Three is printed: "+list3);   
       
       System.out.println("__________________________________________________");
       List<Integer> listeven=new ArrayList<>();
       for(int i:list1)
       {
           if(i%2==0)
           {
             listeven.add(i);
           }
       }System.out.println("List One is printed: "+list1);
        System.out.println("Print the Even Number: "+listeven);

System.out.println("___________________________________________________________");

        //Using Stream API
       Stream<Integer> stream= list1.stream();
       List<Integer> newlist= stream.filter(i->i%2==0).collect(Collectors.toList());
        System.out.println(newlist);
        System.out.println("____________________________________");

       List<Integer> newlist1= list1.stream().filter(i->i%2==0).collect(Collectors.toList());
   System.out.println(newlist1);

       List<Integer> newlist2= list1.stream().filter(i-> i> 10).collect(Collectors.toList());
       System.out.println("Grater number of 10: "+newlist2);
    }
}