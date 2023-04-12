public class StaticInnerclass {
    static int b;
    void sayHello(){
        System.out.println("hi");
    }
    public static void main(String[] args) {
        Animal.Dog  d=new Animal.Dog();
        System.out.println(d);
        System.out.println(b);//it working because here we declaring static variable.without static it shows error.like this same function mention as a static
        sayHello();//it shows errors because we are not using static function.
        
    }
    
}
class Animal{
  static  int x;
    static class Dog{//if inner class static not required mention static in variables and function.if you mention function as a static also function variable as static
        int y;

        void sum(){
            System.out.println(y+x);//here x shows error becuase if inner class in static we have mention outer class variable and function also in static  because we are aceessing outer class v and fu into inner classs.
        }
    }
}
