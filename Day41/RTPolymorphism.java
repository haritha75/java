//Runtime polymorphism obtained through method overriding.
//call a method at runtime called runtime polymorphism.
//samefunction with same parameters.

public class RTPolymorphism {
    public static void main(String[] args) {
        Parrot.speed();//here, we mention parrot class but it is a subclasss of birds class that means birds class function aslo inherite to the parrot classs but same function are in parrot and birds class so here you calling subclass so it prepares subclass first if both are same functions.
        Owl.speed();//it also same ,same function in sub and super class .here  we calling sub class so it return subclass function output.
        Birds.speed(); 


        
    }
}

    class Birds{
      static void speed(){
            System.out.println("too speed");
        }

    }

    class Parrot extends Birds{
     static  void speed(){
            System.out.println("heavy speed");
        }

    }
 
    class Owl extends Birds{
      static  void speed(){
            System.out.println("speed very low");
        }
    }
    

