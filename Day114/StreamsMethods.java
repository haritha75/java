import java.net.Socket;
import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamsMethods {

    public static void main(String[] args) {
        

        List<String> list = List.of("neel","virat","revi","raj"); //list of method is used whateverwe mention in the method that data set as list and converting into stream data.
        Stream<String>  stream = list.stream(); 

        stream.forEach(name -> System.out.println(name));

        Stream<String>  stream1 = list.parallelStream(); //it  will not print sequentially.
        stream1.forEach(name -> System.out.println(name));
        System.out.println();

        //optional means if your code not execute successfully  all the time on that time occurs error or exception .to prevent that problem we are using optional type it executes successfully with exit code 0.
        System.out.println(IntStream.of(4,8,6,77,1,45).min()); //of method is static method it accepts multiple values and min method type is optional.that means if you are not passing value it execute code with successfully.
        System.out.println(IntStream.of().min()); //if you are not passing values. so it returns empty with successful code.
        System.out.println(IntStream.of().min().orElse(0)); //if values are the of method it returns minimum value otherwise it returns whatever you mention in orElse() method.

        System.out.println();

        OptionalInt min = IntStream.of().min();
        System.out.println(min);

        OptionalDouble avg1 = DoubleStream.of(4,8,2,9).min();
        System.out.println(avg1.getAsDouble());
        System.out.println(avg1.isPresent()); //if value have it returns true.
        System.out.println(avg1.isEmpty()); //if avg1 empty it returns true.
        System.out.println(avg1.orElse(0.0)); //if no pasing values then it returns 0.0

        OptionalLong max = LongStream.of().max();
       // System.out.println(max.getAsLong()); //whenever not passing values and print max.get method then it occurs errors. then use like this.
        if(max.isPresent())
            System.out.println(max.getAsLong());
        else
            System.out.println("value is not present");


        double avg = DoubleStream.of(77,95,33,85,99).average().orElse(0);
        System.out.println(avg);


        long sum = LongStream.of(44,8,2,5,9).sum();
        System.out.println(sum);



        List<Integer> list1 = List.of(2,5,7,8,1);
        System.out.println(list1.stream().findAny()); //it returns firstvalue.
        System.out.println(list1.parallelStream().findAny());
        System.out.println(list1.stream().findFirst());
        System.out.println();

        System.out.println(list1.stream().anyMatch(n -> n>0)); //if one match the condition it returns true.
        System.out.println(list1.stream().allMatch(n -> n>0)); //if all values matches the condition it returns true.
        System.out.println(list1.stream().noneMatch(n -> n<0)); //if all values opposite to the condition then it returns false.




    }
    
}
