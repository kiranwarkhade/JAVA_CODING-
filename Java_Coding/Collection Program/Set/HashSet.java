import java.util.*;
public class HashSet {
    public static void main(String[] args) {
        
        java.util.HashSet<String> set=new java.util.HashSet<>();

        set.add("kiran");
        set.add("jay");
        set.add("virat");
        set.add("zizi");
        set.add("bb");   
        set.add("AA");
        System.out.println(set);
       //first way
        Iterator<String> itr=set.iterator();
        while(itr.hasNext())
        {
            System.out.print(itr.next()+" ");
        }
        //second way
        Set<String> sl=new TreeSet<String>(set);
        System.out.println(sl);
        // third way
        List<String> li=new ArrayList<>(set);
        Collections.sort(li);
        System.out.println("sort"+li);
       String s= li.get(2);
        System.out.println(s);
    }
}
