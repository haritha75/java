import java.util.List;
//sometime it is a terminal operations and intermediate operations.
//it can return end result.
public class ReduceMethodInStreams {

    public static void main(String[] args) {

        List<Integer> list = List.of(1,2,4,6,8); 

        Integer res = list.stream().reduce(0,(acc,value)-> acc+value); //it return integer values.

        System.out.println(res);
        
    }
}