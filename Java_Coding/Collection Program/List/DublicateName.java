import java.util.*;
import java.util.HashSet;
public class DublicateName {
public static void main(String[] args) {
List<String> list = new ArrayList<String>();
list.add("a");
list.add("Raj");
list.add("c");
list.add("d");
list.add("Raj");
Set<String> set=new HashSet<>();
for(String name:list)
{
    if(set.add(name)==false)
    { System.out.println("Dublicate name: "+name);  }
    }   
}}
