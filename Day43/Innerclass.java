public class Innerclass {
    public static void main(String[] args) {
        Animal a=new Animal();
       //System.out.println(a.y); //it shows error because it cannot access inner class variable.
       Animal.Dog d=a.new Dog();
       System.out.println(d.y);//it working because y value in inner class only.
        
    }
    
}
class Animal{//outer class
    int x;

   class Dog{//inner class .you can use innder class 4 modifiers.
        int y;
    }
}
