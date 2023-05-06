//whenever you give the data which is greater than stack that time it happening.it is not exception it is  an error.it is depends on stack or storage.
//like given wrong logical input or wrong base condition.it is a run time error.

public class StackOverFlowError11 {

    public static void main(String[] args) {

        System.out.println("hello");
        

            mock();
    }

    public static void mock() {

        mock(); //here we are not given proper condition
    }

}