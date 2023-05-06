
//whenever subclass handling parent class that time it occurs.because subclass has no right to handle superclass.
//it is a runtime exception.
public class ClassCastException11 {


    public static void main(String[] args) {

        Human h =new Human();

        Virat v =new Virat();
         Virat x = (Virat) h;
    }
}
class Human {

}
class Virat extends  Human {

}
