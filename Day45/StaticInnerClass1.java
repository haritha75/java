public class StaticInnerClass1 {
    public static void main(String[] args) {
        Animal.Deer d=new Animal.Deer();
        d.add();
    }
    
}
class Animal{
    static int x=10;
   static int sum(){
    
         return 5;

    }
    static class Deer{
        int c=sum();
        void add(){
            System.out.println(x);
        }
        
    
}
}