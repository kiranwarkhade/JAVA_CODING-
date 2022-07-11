import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamObject {
    public static void main(String[] args) {
        
        Stream<Object> empty=Stream.empty();
        empty.forEach(e-> {System.out.println(e);});
 
        String [] names={"Sachin","kiran", "Jay", "Tushar"};

        Stream<String> stream1=Stream.of(names);
        stream1.forEach(e->{System.out.println(e);});

        //2
        Stream<Object> steamBuilder=Stream.builder().build();

        //3
        IntStream stre= Arrays.stream(new int[]{2,4,6,55,3,112,3});
        stre.forEach(e->{System.out.println(e);
        });

    }
  
}
