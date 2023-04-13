public class StaticInnerclass11 {
   static int s;
   void say(){//it is not static so create object and call the function with object.because we are calling in static method so mention static.
    System.out.println("where");
   }
    public static void main(String[] args) {
        Animal.Cat.sum();//it means in animal class and inner class function calling and dog function inherite into cat class.
        System.out.println(s);
        StaticInnerclass11 s11=new StaticInnerclass11();
        s11.say();
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