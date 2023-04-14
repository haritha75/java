public class Interface11{
    public static void main(String[] args) {
        X a=new Mock();
        a.sum();
        
    }
}
interface X{
    public void sum();
}
class Mock implements X{
    public void sum(){
        System.out.println("sum of three numbers");
    }
}