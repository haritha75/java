//unboxing means converting object of wrapper class into primitive value.here already wrapper object cover up with box if converting it then first remove box then it called unboxing.

public class Unboxing {

    public static void main(String[] args) {

        Integer i = new Integer(10); //wrapper class object
        int i1 = i; //primitive value.here we are assigning wrapper object to the primitive type.

        System.out.println(i);
        System.out.println(i1);
    }
}
