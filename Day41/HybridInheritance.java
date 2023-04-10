//different clasees uses or inheritante same super class.
public class HybridInheritance {
    public static void main(String[] args) {
        Vivo v=new Vivo();
        v.color("silver");
        Realme r=new Realme();
        r.storage();
        v.company("vivo");
        System.out.println(r.type(10));
        
    }
}
class Phone{
    String color;
    String brand;
    void color(String color){
        System.out.println(color);

    }
}
class Realme extends Phone{
    void storage()
    {
        System.out.println("too speed");
    }
    boolean type(int a){
        if(a>8)
        return true;

       return false; 
    }

}

class Vivo extends Phone{
    void company(String a){
        System.out.println("company name "+a);

    }
}