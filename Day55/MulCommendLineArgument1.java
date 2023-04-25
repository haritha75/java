public class MulCommendLineArgument1 {
    
    public static void main(String[] args) {
        
        int mul = 0; //here we are multiplying first and second index.

        for (var x : args) {

            mul*=Integer.parseInt(x);

        }

        System.out.println(mul);
    }
    
}
