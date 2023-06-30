public class CovarientReturnTypeExample {

    public static void main(String[] args) {

        new Rock().mania(7);
        
    }
    
}
class John {

    Object mania(int x) {
        System.out.println("it is a parent class");
        return this;
    }
}
class Rock  extends John {

    String mania(int y) { //here we overriding the method in above return type is object .it is parent class of all the classes. so it accept all the classes.String.
        System.out.println("rock");
        return null;

    }
}