public class InterfaceClass {

    public static void main(String[] args) {
        
    Ki k = new Ki();
    k.hello();
    k.rock();
    }
}
interface Gi {
    void hello();
    void rock();
}
abstract class Hi implements Gi {
  public  void hello() {
        System.out.println("hello");
    }
    public void rock() {
        System.out.println("rock");
    }
}
class Ki  extends Hi{

}