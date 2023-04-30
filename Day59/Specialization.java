//converting super class type into subclass type.it is a down casting.more details about the super class. for example phone, in phone different type, colors, storage,company called specialization.

public class Specialization {

    public static void main(String[] args) {
        
         Deer d = new Deer();

         d.eat();
         d.sleep();
         d.speed();
    }
    
}
class Animal {

    public void sleep() {

        System.out.println("moo");

    }
}
class Deer extends Animal {

    public void speed() {

        System.out.println("it too speed");
    }

    public void eat() {

        System.out.println("gross");
    }
}