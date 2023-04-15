public class AbstractClass {
    public static void main(String[] args) {
        System.out.println(Animal.x);//its working even its abstract class if variable in static its working.
        Animal.sum();//it also same its static ,ethod even if abstract class its working.there is no abstract methods so its working.
        
    }
    
}
abstract class Animal{
     static int x=10;
     static public void sum(){
        System.out.println("sum");
     }
}
