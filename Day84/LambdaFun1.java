public class LambdaFun1 {

    public static void main(String[] args) {

        Nock n = x -> x+10; // if you have only one perameter you choice to mention brackets or not but if you more thant one paramete you must mention brackets.and one more thing if you have one line statement then we donot need to mention expression type like this {}; that's your choice.if ypu mention brackets that type we have to mention return type otherwise donot need it will come by defaultly.
           
        System.out.println("hello"); //it is actually outside the lambda expression so it is not belongs to  nock methods.

          System.out.println(n.sum(9));
        

    }
    
}

@FunctionalInterface

interface Nock {


    int sum(int x);
}