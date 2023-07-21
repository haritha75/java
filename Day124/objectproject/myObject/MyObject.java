package myObject;

public class MyObject {

    static int count =0;
    int serialNo;
    public MyObject() {

        count++;
        serialNo = count;
    }

    public void display() {
        System.out.println("I am an object number "+serialNo);
    }

    public static int getCount() {
        return count;
    }
}
