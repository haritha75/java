//if you mention deprecated even if you call that one it shows warning that time use SuppressWarnings.
public class DeprecatedAnnotation1 {

    public static void main(String[] args) {
        @SuppressWarnings("deprecation")
        Nick n = new Nick();
        n.run();



    }
}
 class Nick {
    @Deprecated

     public void run() {
        System.out.println("run .....");
    }
 }