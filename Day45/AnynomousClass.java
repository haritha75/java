//without creating new class overriding a method.
public class AnynomousClass {
    public static void main(String[] args) {
        Animal a=new Animal(){

            public void sum(){
                System.out.println("multiplication");
            }
        };
        a.sum();
    }
    
}
class Animal{
    public void sum(){
        System.out.println("sum of two values");
    }
}
