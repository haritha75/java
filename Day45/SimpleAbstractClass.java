public class SimpleAbstractClass {
    public static void main(String[] args) {
        //Mock m=new Mock();//its not working because it's abstract class.
       // m.main();
       Rock r=new Rock();
       r.main();
       r.sum();
    }
    
}
abstract class Mock{//without abstract methods we have mention abstract class but we are calling that function that time create another class and extends that functions.
     public void sum(){
        System.out.println("sum of two numbers");
     }
     public void main(){
        System.out.println("main function");
     }
}
class Rock extends Mock{//here we are not implementing anything becausse there is no abstract function.just extending functions into sub class without abstract class.

}