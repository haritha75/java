@SuppressWarnings("unused")
public class Shock {

    int x;
    int d;
    private int z;

    public int getZ() {
        return z;
    }

    private void display() {
        System.out.println("actually private type we cannot access in another class but using reflection api we can get the information.");
    }

}
