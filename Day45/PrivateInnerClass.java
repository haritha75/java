public class PrivateInnerClass {
    

    public static void main(String[] args) {
        Animal a=new Animal();
       //System.out.println(a.y); //it shows error because it cannot access inner class variable.
       
        
    }
    
}
class Animal{//outer class
    int x=2;

  private class Dog{//inner class .you can use innder class 4 modifiers.
        int y=8;
        public void sum(){
            System.out.println(x);
        }
    }
    Animal(){
        Dog d=new Dog();
        d.sum();

    }
}