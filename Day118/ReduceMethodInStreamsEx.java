import java.util.List;

public class ReduceMethodInStreamsEx {

    public static void main(String[] args) {
        
        List<String> list = List.of("hello ","everyone");

        String res = list.stream().reduce("hey!", (acc,val)->(acc+val));

        System.out.println(res);



        List<String> list1 = List.of("h","a","r","i");

        String res1 = list1.stream().reduce("yerukondu", (acc,val)->(acc+val));

        System.out.println(res1);

    }
    
}
