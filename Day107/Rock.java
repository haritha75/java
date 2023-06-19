public class Rock {

    byte a = 10;
    static byte b = 12; //this static variable store in class loader because it is a static so only one copy will be created.it will check variable if their it increases.
    void hello() {
        a++;
        b++;
        System.out.println(a+" "+b);

    }

    public static void main(String[] args) {

        Rock r = new Rock(); //this object stored in heap and all the values stored whenever complete the object work it will removed from the heap and new variable stored again.

        r.hello(); 

        Rock r1 = new Rock();
        r1.hello();

        Rock r2 = new Rock();
        r2.hello();
        
    }
}