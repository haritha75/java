public class LambdaFun3 {

    public static void main(String[] args) {

        Duck d = () -> System.out.println("this is single statements so we donot need to mention in brackets.");

        d.sayHello();
        
    }



    
}
@FunctionalInterface

interface Duck {

    void sayHello();
}