import myObject.MyObject;

public class Main {
    public static void main(String[] args) {

        MyObject myObject = new MyObject();
        MyObject myObject1 = new MyObject();
        MyObject myObject2 = new MyObject();
        
        myObject.display();
        myObject1.display();
        myObject2.display();

        System.out.println(MyObject.getCount());

    }
}