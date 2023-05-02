//exception means unwanted events which occurs during excution of the program.they are two types 1.runtime 2.compiletime
//runtime exception happening in the logical expressions like overflow,wrong input at that time it happens in runtime of the program.

public class RunTimeException {


    public static void main(String[] args) {
        
        System.out.println("hi guys!");
        System.out.println("how are you!");

        int a = 5/0; //this syn correct but it not logical correct

        System.out.println(a);

        System.out.println("rock the show"); //here this also not print  because above we have error so that's why not printed.
        System.out.println("you did it");
    }
}