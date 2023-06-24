public class Re_AssigningVariable {

    public static void main(String[] args) {

        Animal a = new Animal("cow","white");
        Animal a1 = new Animal("goat","black");
        Animal a2 = new Animal("Horse","brown"); //here, a2 variable pointing to the objects.

        a2 =a;  //whenever same variable pointing another objects then previous objects removed from the heap because that objects not poining any reference so garbage collector removed.
        System.out.println(a2);

        
    }
    
}

class Animal {

    String name ;
    String color;

    Animal () {

    }

    Animal(String name,String color) {

        this.name = name;
        this.color = color;

    }

    @Override
    public String toString() {
        return "Animal [name=" + name + ", color=" + color + "]";
    }

}