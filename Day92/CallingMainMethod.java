public class CallingMainMethod {

    public static void main(String[] args) { //whenever run the code like this javac Rock that time jvm will call like this Rock.main that means jvm are calling class with static main method.that time whatever statemetns in main method that will be excuted.and public means we can access this method any where we donot know where jvm will have and static means without creating object we are calling the method.

        System.out.println("rock");

    }
}
class Mock {

    void run() {
        System.out.println("rockman!");
    }
}