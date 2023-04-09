package nonwild;
import wild.*;

public class Sheep extends Tiger{
    protected static void noice(){
        System.out.println("different noice");
    }
    public static void main(String[] args) {
        Tiger.speed();//delcaring public and using  different packagewith subclass.
    }
}
