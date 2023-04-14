public class ClassAbstract2 {
    

    public static void main(String[] args) {
        Mock m=new Mock();//it shows error because we are implementing only one abstract method not two but two abstract methods extending sub class.
        m.sum();
    }
    
}
abstract class Rock{
    public void sum(){
        System.out.println("sum of two numbers");
    }
    abstract public void main();
    abstract public void hello();
}
abstract class Mock extends Rock{//here extending super class soo in super class two abstract method  in this class 1) make class as a abstract 2)otherwise implementing all abstract methods in this class without mentioning abstract class otherwise mention class as abstract..like overriding method.
    
    public void main(){
       System.out.println("main method");
    }
}
