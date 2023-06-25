public class FinalizeMethodExample1 {
    
    public static void main(String[] args) {

        FinalizeMethodSample s = new FinalizeMethodSample();

        s = null;

        System.gc(); // Explicitly call the garbage collector

    }
}
class FinalizeMethodSample {
    @Override
    protected void finalize() throws Throwable {

        System.out.println("before destroying the object garbage collector calling the finalize method for cleanup activities.");

    }
}