public class AbstractAndFinalClass {

    public static void main(String[] args) {

        Mock m = new Nock(); //here we are creating the variable to the nock class.
        System.out.println(m.x);
        
    }
    
}

abstract class Mock {

    int x = 10; //here,we are printing abstract class variable that time create new class and extends the abstract class to thaat class.
}
class Nock extends Mock {

}
final class Rock { // final class we cannot inherite or extending the other class.

}
    

