public class AnnonimousClass {

    public static void main(String[] args) {

        Animal a = new Animal() { //here, we can create more methods but calling only interface class methods if you want to  remaining methods  also then call remaining methids in interface class methods.

            public int add(int a ,int b) {
                return a+b;
            }
           public  void eat() {
                System.out.println("eating.....");
                System.out.println(add(4,7)); //like this remaining methods calling  in the interface class methods.
                
            }

        };
        a.eat();
    
        
    }
    
}
interface Animal {

    void eat();
}