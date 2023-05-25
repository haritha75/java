//lambda function only used in functional interfaces because in functional interface have only one method so in lambda expression whatever  you  write something that belongs to functional interfaces method.if you have two or more methods that time in lambda function or expression is confused which method is it belongs to.so that's why we are using only functional interfaces only.
//and also using lambda function time saving and code reducing.

public class LambdaFun {

    public static void main(String[] args) {

        Mock m = () ->{ //in this expression whatever you write that belongs to functional interface method only.if you have two methods that time which method we are writing or whcich method its belongs to. get confused.so that's why using only function interfaces.

            System.out.println("hello guys!");

        };
        m.hi();
        

    }
}

@FunctionalInterface

interface Mock {

    void hi();
}