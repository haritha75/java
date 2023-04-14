//without creating another class and object overriding a method called Anyonymous.
public class InterfaceAnonymousClass {
    public static void main(String[] args) {
        Rock r=new Rock(){
            public void sum(){
                System.out.println("sum of two numbers.");

            }
        };
        r.sum();
    }
    
}

interface Rock{
    public void sum();
}
//class Stone implements Rock{
   // public void sum(){

//    }
//}