public class WrapperClass {

    public static void main(String[] args) {

        Integer i = 55; //wrapper class declaring like this

        MyInteger  num = new MyInteger(15); //wrapper class
    }
}

class MyInteger {

    int value; //primitive data type  variable.

    MyInteger(int value) { //constructor
        this.value = value;

        System.out.println(this.value);
    }
}
