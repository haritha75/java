// if you want or when you required that time we must call that object that time only object will be stored or created in the class loader.because we are not creating object to that class at first.
public class LazyInstantiation {

    public static void main(String[] args) {

        A3.getInstance();
        A3.getInstance(); //if you calling method same object will be pointing.



    }
}
class A3 {
    private static A3 obj; //here we are declaring variable.
    private A3() {

    }
    public static A3 getInstance() {
        if (obj == null) {
            obj = new A3(); //here we are creating object.
        }
        return obj;
    }

        public static  void run() {
            System.out.println("run....");
        }

    }

