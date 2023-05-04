public class ThrowsAndThrow {


    public static void main(String[] args) {
        
        rock(5,0); //here first calling the function and rock function also calling divide function and then go to the divide method it check the exception and  we are throw the exception and it will search for that  catch block exception.
    }
    static int rock(int c,int d) {
        try {
        int r = divide(c,d);
        }
        catch(Exception e) {
            System.out.println(e);
        }
        return 10;
    }

    static int divide(int a,int b) {
        if(b==0) 

          throw new ArithmeticException();

       return a/b;   

    }
    
}
