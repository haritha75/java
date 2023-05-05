//when you do some operations on null then this exception occurs.
public class NullPointerException1 {


    public static void main(String[] args) {
    
        fun(null);

        

    }
    public static void fun(String s) {

        try{

        System.out.println(s.toLowerCase()); //here we do null operation that time we get exception so we use try,catch blocks for catching exception.
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
}
