public class Rock{
    public static void main(String[] args) {
        int x=5;
        Nick n=new Nick();
        System.out.println(n.a);
        Nick n1=new Nick();
        n1.a=12;
        System.out.println(n1.a);
        
    }
}
class Nick{
    int a;
    static int b;
}