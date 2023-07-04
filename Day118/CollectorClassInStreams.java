import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CollectorClassInStreams {

    public static void main(String[] args) {
        
      List<String> list = List.of("Rock","The","World");

      String res = list.stream().collect(Collectors.joining("_")); //collect is method it collect  stream data and Collectors is class then joining is a static method inCollectors class.it is used to joining the word into String or line using delimiter.
      String res1 = list.stream().collect(Collectors.joining(" ",">>","<<<"));

      System.out.println(res);
      System.out.println(res1);

    }
    
}
