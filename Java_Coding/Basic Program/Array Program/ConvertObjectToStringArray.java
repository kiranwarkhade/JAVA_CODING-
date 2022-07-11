import java.util.ArrayList;
import java.util.List;
public class ConvertObjectToStringArray {
       public static void main(String[] args) {
      List<String> data = new ArrayList<String>();
      data.add("A");
      data.add("B");
      data.add("C");
      //Object[] objects = data.toArray();
      String[] strObjects = data.toArray(new String[0]);
      for(String obj: strObjects) {
         System.out.println(obj);
      }
   }
}

