import java.util.List;
import java.util.Optional;

public class ReduceMethodInStream1 {

    public static void main(String[] args) {
        
        List<Integer> list = List.of(123,567,345,673);

        Optional<Integer> res = list.stream().reduce((acc,value)->{ //whatever list returns the type that can mentioning in the result type.an also here not mentioning intial value.

            System.out.println("acculator " +acc +"value "+value);
            return acc+value;
        });
        System.out.println(res.get()); //it returns the result after performing all the operations.





        //another way

        List<Integer> list1 = List.of(1,2,4,6,8); 

        Optional<Integer> res1 = list1.stream().reduce((acc,value)-> acc+value);


        System.out.println(res1.get());


    }
    
}
