public class NestedClassMethod {
    public static void main(String[] args) {
        Outer.Inner in=new Outer().new Inner();
        in.sum(2,7);
        
    }
    
}
class Outer{
    class Inner{
        public void sum(int a,int b){
            System.out.println("sum of  two numbers "+a+b);
        }
    }
}
