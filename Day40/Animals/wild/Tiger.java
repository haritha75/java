package wild;

public class Tiger {
    public static void speed(){
        System.out.println("too much speed");
    }
    
        public static void main(String[] args) {
            Lion.eat();//it working because protected modifer with same package but different class and without subclass
        }
    
}
