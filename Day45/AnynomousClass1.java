public class AnynomousClass1 {
    public static void main(String[] args) {
        Animal a=new Animal(){
            public void dog(){
                System.out.println("gow  gow");
            }
            public void cow(){
                System.out.println("amma amma");
            }

        };
        a.dog();
        a.cow();
    }
    
}
class Animal{
    public void dog(){
        System.out.println("bow bow");
    }
    public void cow(){
        System.out.println("hello hello");
    }
}
