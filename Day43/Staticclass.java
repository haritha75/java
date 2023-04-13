public class Staticclass {
   static  int hello(){
        System.out.println("good");
        return 5;
    }
    public static void main(String[] args) {
        hello();//here we calling 
        
        Animal.Dog dog=new Animal.Dog();
        //System.out.println(dog);
        dog.sum();
        
    }
}
class Animal{
     static int x=9;
     static int sayHello(){
        System.out.println("Hi");
        return 9;
     }
     static class Dog{//static inner class
        int y=7;
        void sum(){
            System.out.println(y+x);//here we acceessing x value in inner class so mention static x variable.
            sayHello();//here we are calling outer class function into inner class so mention static function because inner class function static.
     }
}
}