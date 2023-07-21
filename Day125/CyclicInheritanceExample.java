public class CyclicInheritanceExample {

    public static void main(String[] args) {
        

    }
    
}
class A extends A { //see here same class inheriting.

}

class B extends C { //here also cycllic inheritance happening.here,we are implements superclass and subclass at the same time.

}
class C extends B {

}