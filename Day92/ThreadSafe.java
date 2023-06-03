import com.sun.source.tree.SynchronizedTree;

//whenever creating multiple objects to the programs it will take only one at a time.
//multiple threads cannot access simultaneously.
public class ThreadSafe {
    public static void main(String[] args) {


        A4.getInstance();
        A4.getInstance();

    }
}
class A4 {
    private static A4 obj; //here we are declaring variable.

    private A4() {

    }

    synchronized public static A4 getInstance() {
        if (obj == null) {
            obj = new A4(); //here we are creating object.
        }
        return obj;
    }
}