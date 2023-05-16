//one interface extends anotther interface.
//class implements the interfaces.

public class ExtendingInterface {

    public static void main(String[] args) {


        Animal  a = new Animal();
        a.jump();
        a.deer();


    }
    
}

interface Mock {

    public void jump();
}
interface Rock extends Mock {

    public void deer();
}

class Animal implements Rock {

    public void jump() {
        System.out.println("its jumping");
    }

    public void deer() {
        System.out.println("deer is too fast");
    }
}
