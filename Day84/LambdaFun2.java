public class LambdaFun2 {

    public static void main(String[] args) {

        Animal a = (x,y) -> {

            return x*y+(3+7+8*123); //it is a single line statement you donto need brackets you write in directly without mentioning brackets also.in this whatever you write that belongs to functional interface method.
            

        };

        System.out.println( a.deer(6, 12));


        System.out.println("hello"); //it is not belongs to functional interface method because it can be written outside the lambda expression.
        
        System.out.println( a.deer(6, 12));

    }
    
}

@FunctionalInterface

interface Animal {

    int deer(int x,int y);
}