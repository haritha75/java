public class Finalclass {
    public static void main(String[] args) {
        Deer d=new Deer();
        d.setX();
       System.out.println(d.getX());
    }
    
}
final class Animal{//final class means using final keyword it cannot inheritante another class.
    private int a;
   public void setX()
    {
        a=9;
    }
  public  int getX(){
        return this.a;
    }
}
class Deer extends Animal{
   
}
