import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
public class Arraylist
{
   public static void main(String[] args) {
       List<String> list=new ArrayList<>();
       list.add("ram");
       list.add("sham");
       list.add("man");
       list.add("sham");
       list.add("ram");
       Set<String> set=new HashSet<>();
       for(String s: list)
       {
           if(set.add(s)==false)
           {
               System.out.println(s);
           }
       }
       
     
       

   }
}

