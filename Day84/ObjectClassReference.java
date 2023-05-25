public class ObjectClassReference {

    public static void main(String[] args) { //creating object using parent class but not creating object  using child class for the object class.


        Object o = new Mock(); //here we are taking object class and creating object to the mock class its working because it is a parent class of all other classes.but not creating object to the object class using child class because it is not parent class of object class.
        ((Mock) o).say();
        
        
    }
    
}
class Mock {

    public void say() {

        System.out.println("hello guys!");
    }
}