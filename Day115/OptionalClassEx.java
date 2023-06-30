import java.util.Optional;

public class OptionalClassEx {

    public static void main(String[] args) {

        String name = null;
        Optional<String> nameOptional = Optional.ofNullable(name); //if not sure your value null or value then use 
       // System.out.println(nameOptional.get()); //here, whenver value is null that time you use get method it shows exception.

        if(nameOptional.isEmpty())
        System.out.println("it's empty"); //it means whenever string is null then it will occurs exceptions or error it print whatever you are writing in the statement  will be printing.
        else 
         System.out.println(nameOptional.get());
    

       // printUpperCase(name);
        
    }
    
    // static void printUpperCase(String name) {
    //     if(!(name ==null))

    //     System.out.println(name.toUpperCase());
    //     else 
    //     System.out.println("it's empty");
    // }
}
