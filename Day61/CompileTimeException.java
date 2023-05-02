//exception means unwanted events which occurs during excution of the program.they are two types 1.runtime 2.compiletime
//compiletime exception happening in syntax expressions like missing crct syntax,not assigning or intialized any value   at that time compile time exception happens.it will not print at least one statement also.because it happening in the compile time so not printing.

public class CompileTimeException {
    
    public static void main(String[] args) {
        
        System.out.println("hi guys!");
        System.out.println("how are you!");

        int a ; //this syn correct but it not logical correct

        System.out.println(a);

        System.out.println("rock the show"); //here this also not print  because above we have error so that's why not printed.
        System.out.println("you did it");
    }
}