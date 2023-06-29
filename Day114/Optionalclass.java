import java.util.Optional;

public class Optionalclass {

    public static void main(String[] args) {
        
        String a[]= new String[10];
        Optional<String> checkNull = Optional.ofNullable(a[5]); //if not using optional calss then it shows exception.
        if(checkNull.isPresent()) {
            String word = a[5].toLowerCase();
            System.out.println(word);
        }
        else 
        System.out.println("word is null");
    }
    
}
