public class StaticInnerclass11 {
   static int s;//instance variable working only with in the calss so use ststic if use other class or method.
    public static void main(String[] args) {
        Animal.Cat.sum();//it means in animal class and inner class function calling and dog function inherite into cat class.
        System.out.println(s);
    }
    
}
class Animal{
    static int x;
    static int sayHI(){
        return 5;
    }
    static class Dog{
        static void sum(){
            System.out.println(5);
        }
    }
    static class Cat extends Dog{// it means extends dog class so  dof function all inherite into cat class .

    }
}