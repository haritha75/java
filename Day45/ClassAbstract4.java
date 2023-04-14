public class ClassAbstract4 {
    

    

    public static void main(String[] args) {
        Mock m=new Mock();//now its working because here we are implementing abstract methods also it working.
        m.sum();
        m.hello();
        m.main();
    }
    
}
abstract class Rock{
    public void sum(){
        System.out.println("sum of two numbers");
    }
    abstract public void main();
    abstract public void hello();
    

    
}
 class Mock extends Rock{//here extending super class soo in super class two abstract method  in this class 1) make class as a abstract 2)otherwise implementing all abstract methods in this class without mentioning abstract class otherwise mention class as abstract..like overriding method.
    
    public void main(){//here we are implementing abstract methods so donot mention class as abstract if you not implementing method mention class as abstract class.implement all abstrct method.if you not implementing all abstract methods also make class as abstract.
       System.out.println("main method");

    }
    public void hello(){
        System.out.println("hello everyone");
    }
}
