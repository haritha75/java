//lambda funcction is a small anonymous function.it takes any number of arguments,it have only one expressions.
//and aslo if you use lambda function time also saving and code also reducing.
public class LambdaFunctions {

    public static void main(String[] args) {

        Nock  n = () -> { //it is lambda function.

            System.out.println("say hi to everyone!");
        };
        n.hello();
        
    }
    
}
@FunctionalInterface

interface  Nock {

    void hello(); 

    
}