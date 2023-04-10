//Polymorphism means different form or many form.two types compiletime polymorphism and runtime polymorphism.
//compiletime polymorphism is obtained through method overloading.
//method overloading means same method with different parameters.

public class CTPolymorphism {
    public static void main(String[] args) {
        Phone p=new Phone();
        p.company("realme");//which function you have call  only that function will be converting into byte code in compile time and gives the output called compile time polymorphism.
        
    }
}

class Phone{
   void company(){
        System.out.println("too speed");
    }
   void company(String x){
        System.out.println("heavy speed");
    }

   void company(String a,String x){
        System.out.println("high speed with super quality");
    }

}
