import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorsClassInStreams {

    public static void main(String[] args) {
        
        List<String> list = List.of("Focus","consistency","ability");

        List<String> res = list.stream().map(n -> n+"life").collect(Collectors.toList());
        List<String> res1 = list.stream().map(n -> n).toList();
        Set<String> res2 = list.stream().map(n -> n).collect((Collectors.toSet()));

        Map<String,String> map = list.stream().collect(Collectors.toMap(n1 -> n1,n2 -> n2));
        Map<String,Integer> map1 = list.stream().collect(Collectors.toMap(n1 -> n1,n2 -> n2.length()));

        List<Integer> li = Stream.of(1,3,5,7,9,10).collect(Collectors.toUnmodifiableList()); //it is used if your list not changed other person that time use this mwthod.

        List<String> li1 = new ArrayList<>(List.of("rock","the","world"));
        Map<Integer,List<String>> map2 = li1.stream().collect(Collectors.groupingBy(String::length)); //here first list converting streams and one by one returns value or string length and second time it return string.
        Map<Boolean,List<String>> map3 = li1.stream().collect(Collectors.partitioningBy( str -> str.contains("o"))); //here string contains o character it return true otherwise false.
        Map<Boolean,List<String>> map4 = li1.stream().collect(Collectors.partitioningBy( str -> str.endsWith("e")));
        System.out.println(map2);
        System.out.println(map3);
        System.out.println(map4);



        System.out.println(res);
        System.out.println(res1);
        System.out.println(res2);
        System.out.println(map);
        System.out.println(map1);
        System.out.println(li);

    }
}