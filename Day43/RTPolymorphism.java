//here we change 4 legs into two legs is called method overrridng. we can modifiying the data using method overring.
public class RTPolymorphism {
    public static void main(String[] args) {
        kangaroo k=new kangaroo();
        System.out.println(k.getNoOfLegs());
        
    }
    
}
class Animal{
   private int noOfLegs=4;
    public int getNoOfLegs(){
        return noOfLegs;

    }
}
class Dog extends Animal{

}
class cat extends Animal{
    
}
class kangaroo extends Animal{
    public int  getNoOfLegs(){//pass  this one also (int a).and donot use another datatype it show error necause we are calling same function.
        return 2;
    }
}
