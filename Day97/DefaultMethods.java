public class DefaultMethods  implements Ox1{

    public static void main(String[] args) {

        DefaultMethods d = new DefaultMethods();
        d.books();

    }

//    @Override
//    public void show() {
//
//    }


}
//@FunctionalInterface
interface Ox1 {

  //  void show(); //functional interface contains only abstract but in below we have default method also.so it is not abstract method if you have one more anstract method it shows error.

    default void books() {
        System.out.println("interface contains static and default methods also but it is not better way");
    }
}