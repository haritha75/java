import java.util.Optional;

public class OptionalclassExample2 {

    public static void main(String[] args) {
        

        String a[]= new String[5];

        a[1] = "haritha";

        Optional<String> name = Optional.empty(); //if string is empty it returns empty.
        System.out.println(name);

        Optional<String> name1 = Optional.of(a[1]); //if string contains value it returns that value.
        System.out.println(name1.get().toUpperCase());


    }
    
}
