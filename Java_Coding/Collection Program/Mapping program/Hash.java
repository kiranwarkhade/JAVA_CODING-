import java.util.HashMap;
import java.util.Map;

public class Hash  
{
    public static void main(String[] args) {
    
        Map<Integer, String> map=new HashMap<Integer, String>();
        map.put(1, "Kiran");
        map.put(2, "Sham");
        map.put(3, "Ram");
        map.put(2, "jay");
      //  map.put(2, "Shree");

    //  System.out.println(map);
        // System.out.println(map.size());
        System.out.println(map.put( 2,"Shree"));
         System.out.println(map);
         // map.remove(2);
       //   map.replace( 2, "Dev");
         
          map.replace( 2, "Dev");
        for(Map.Entry e: map.entrySet())
        {
            System.out.println(e.getKey()+" "+ e.getValue());
        }

        if(map.containsKey(4))
        {
            String s=map.get(4);
            System.out.println(s);
        }
        
    }
}