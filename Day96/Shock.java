@SuppressWarnings("unused")
public class Shock {

    int x;
    int d;
    private int z;

   public  Shock(){
        System.out.println("empty constructor");
    }
    public Shock(int a) {
        System.out.println("single constructor");
    }

    public int getZ() {
        return z;
    }

    private void display(int a,String s) {
        System.out.println("actually private type we cannot access in another class but using reflection api we can get the information.");
    }

}
