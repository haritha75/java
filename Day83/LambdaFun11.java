public class LambdaFun11 {

    public static void main(String[] args) {

        Duck d = name -> { //if you have single parameter your choice to mention brackets are not.


            System.out.println("your name is  good");
        };
        d.animal("deer");

    }
    
}

@FunctionalInterface

interface Duck {

    void animal(String name);
}