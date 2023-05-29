public class InstanceOfKeyword22 {

    public static void main(String[] args) {

        Animal a = new Animal();
        if(a instanceof Dog) 
           System.out.println("parent or child type reference and child object instance of child");
        else 
           System.out.println("parent object is not instance of child");   
        
    }
    
}
class Animal {

}
class Dog extends Animal {

}