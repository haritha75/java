public class Throw {
    public static void main(String[] args) {
        
        try {
            divide(5,0); //here we are calling and then go to method and checking condtions if exception occurs it will search for catch block.if catch the exception then it will excute peoper code.

            
        }
        catch(Exception e) {

            System.out.println(e.getMessage());
        }
    }
    static int divide(int a,int b) {

        if(b==0) 

             throw new ArithmeticException("/ by zero"); //this means what exceptions we can throw from a mrthod.here we throw arithmetic exception.

        return a/b;

    }
}