//it is a  bottom-up process of abstraction,where we  club the difference among entities according to the common features and generalize them into a single superclass.

class Father {

    public void work() {

        System.out.println("earning father");
    }
}
class Son extends Father {

    public void work () { //overriding the method

        System.out.println("earning son");
    }
}

class Generalization {
     
    public static void main(String[] args) {

        Father f; // f super class reference
        f = (Father) new Son(); //return sub class reference
        f.work();
        

    }
}