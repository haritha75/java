import java.util.Stack;

//whenever do the operation on stack iif stack is already full that time stackoverflow happens
public class StackOverFlow {

    public static void main(String[] args) {

        Jock j = new Jock();


    }
}

class Jock {

    Jock() {

        System.out.println("overflowing");

            this(4); //here againing we are calling the constructor it will go or run infinite times that means stack is full.so stack overflow happens.

    }
    Jock(int a) {

        System.out.println("2nd constructor");

    }


}