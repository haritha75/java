import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class AllOperationsInStreams {

    public static void main(String[] args) {

        List<Integer> list = List.of(124,564,986,234,148,555,123,755); 
        List<Integer> list1 = List.of(2,3,5,7,8,3,1,3,2);
        list.stream().map(n -> (n)).filter(n -> (n%2==0)).distinct().sorted().forEach(n -> System.out.println(n));
           System.out.println();
        list1.stream().distinct().sorted().filter(f -> (f%2==0)).forEach(n -> System.out.println(n));
         int res=  list1.stream().sorted().filter(n -> (n%2==0)).reduce(0,(acc,val) -> (acc+val));
         System.out.println(res);
        
    }
    
}
