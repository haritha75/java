public class MethodChaining1 {

    public static void main(String[] args) {

        Nock n = new Nock();
        n.hi().rock();
        System.out.println();
        n.rock().shock();
        n.shock().nope();

    }
}

class Nock {

    Nock hi() { //here we are using type is class name.nock means type.

        System.out.println("hi");
        return this; //it returns type of object reference.here nock is the object reference it return that address
    }

    Nock rock() {
        System.out.println("rock");
        return this;
    }

   Nock  shock() {
        System.out.println("shock");
        return this;
    }

    void nope() {

        System.out.println("nope");
    }
}