    
//lambda funcction is a small anonymous function.it takes any number of arguments,it have only one expressions.
//and aslo if you use lambda function time also saving and code also reducing.
public class LambdaFunction12 {


    public static void main(String[] args) {

        Nock  n = (x,y) -> { //it is lambda function.

            int res = x+y;

            System.out.println("say hi to everyone!"+res);
        };
        n.sum(5,40);
        
    }
    
}
@FunctionalInterface

interface  Nock {

    void sum(int x,int y); 

    
}