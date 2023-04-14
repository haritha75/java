public class InnerClass {
    public static void main(String[] args) {
        Animal a=new Animal();
       //System.out.println(a.y); //it shows error because it cannot access inner class variable.
       Animal.Dog d=a.new Dog();
       System.out.println(d.y+a.x);//it working because y value in inner class only.
       d.sum();
        
    }
    
}
class Animal{//outer class
    int x=2;

   class Dog{//inner class .you can use innder class 4 modifiers.
        int y=8;
        public void sum(){
            System.out.println(x);
        }
    }
}