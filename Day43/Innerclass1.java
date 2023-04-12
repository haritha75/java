//here, first creating object with inner class even if in private and assign the value and then calling the function outer class.
public class Innerclass1 {
        public static void main(String[] args) {
            Animal a=new Animal();
           //System.out.println(a.y); //it shows error because it cannot access inner class variable.
           //Animal.Dog d=a.new Dog();
           //System.out.println(d.y);//it working because y value in inner class only.
           a.dogObject(10);
            
        }
        
    }
    class Animal{//outer class
        int x;

    
       private class Dog{//inner class .you can use innder class 4 modifiers.
            int y;
        }
        void dogObject(int x){
            Dog d=new Dog();//it working because private class also in outer class so same class.so private will be used in same classs only.
            //d.y=10;
            System.out.println(d.y);
        }
    }
    
    

