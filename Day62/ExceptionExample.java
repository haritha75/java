public class ExceptionExample {

    public static void main(String[] args) {
        

        int a[]=new int[5];
        try {
            System.out.println(a[7]);
        }

        catch(Exception e) { //if donot know the what type of exception occurs in the code then use exception catch block.because it is a superparent of remaining exception types.
            
            System.out.println("it will catch all type of exception");
        }

        System.out.println("catch and try blocks are pairs blocks");
        System.out.println("without try block catch block not working.");
    }
    
}
