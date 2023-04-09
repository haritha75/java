public class MultipleClasses{

    public static void main(String[] args) {
        Deer d=new Deer();
        d.eat(5);//here in deer class do not have any function but its working that means in this deer class we are inherite the all functions of animal class.
        d.brave();//here we are declare the function in deer class
        d.noise();
        d.speed();//here speed function not in deer class but working .all functions of animal class inheri
        
    }
}
class Animal{//super class/parents class
   int age;
   int years;
   String color;
   void eat(int x){
    System.out.println(x+" biscuits eating");
   }
   void speed(){
   System.out.println("too fast");

   }
   void noise(){
    System.out.println("meowwww");
   }

}

class Deer extends Animal{//here Deer class is sub class of animal class means in animal class function all are inherite into subclass.
    void brave(){
        System.out.println("i am the bravest animal among all");
    }
  
}