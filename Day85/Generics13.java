public class Generics13 {

    public static void main(String[] args) {

        Human<String,Boolean> h = new Human("bird", false);
        Human<String,Integer> h1 = new Human("haritha", 21);

        System.out.println(h.getName());
        System.out.println(h.getBool());
        System.out.println(h1.getName());
        System.out.println(h1.getBool());
        
    }
    
}
class Human<T,U> {

    T name;
    U bool;

    Human(T name,U bool) {
         this.name = name;
         this.bool = bool;
    }

    T getName() {
        return this.name;
    }

    U getBool() {
        return this.bool;
    }
}

