public class ExceptionsEx {

    public static void main(String[] args) {
        
        int arr[]={2,5,67,3};
        int a=10,b=0;

        try {

            System.out.println("hello123");
            System.out.println(a/b); //here also same here occurs exception it will go to the catch block not come back.

            System.out.println(arr[6]);
            System.out.println("hello"); //see here this not printed because above exceptions occurs so it will go that catch block and not come to back.
            System.out.println(a/b);
        }

        catch(ArithmeticException e)  {
            System.out.println("whenever exceptions occurs then it looking for catch method if it is their it will catch and then not go to back");
        }

        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println(arr[2]);
        }
        catch(Exception e) {
            System.out.println("it catch all time of exception so no need to write after other type of exceptions because it will catch if you write it shows error");
        }

        // catch(NumberFormatException e) {
        //     System.out.println("if you write parent class exception then it's not required");
        // } 
        finally {

            System.out.println("whenther eception occurs or not it will excute always");
        }
          
    }
    
}
