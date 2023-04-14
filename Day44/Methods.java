public class Methods {
    public static void main(String[] args) {
        Rock r=new Rock();
        r.dice();
    }
    
}
class Rock{
    int a;
    void roll(){
        System.out.println("dice rolling");
    }
    void dice(){
        this.roll();//here roll function calling with this keyword means class name with function soo this means classs name indicates.
    }
}