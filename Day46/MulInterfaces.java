public class MulInterfaces {
    public static void main(String[] args) {
        Stone s=new Stone();
        s.hello();
        s.show();
        s.call();
        s.sum();
        
    }
    
}
interface Mock{
    public void show();
    public void call();

    
}
interface Rock{
    public void hello();
}
class A{
    public void sum(){

    }
}
class Stone extends A implements Mock,Rock{
    public void show(){
        System.out.println("show me");

    }
    public void call(){
        System.out.println("call me");

    }
    public void hello(){
        System.out.println("hello guys!");

    }

}