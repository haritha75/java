public class Interfaces {
    public static void main(String[] args) {
        Mock m=new Mock();
        m.show();
    }
    
}
interface Rbi{//in interfaces class every method abstract function  that means no body so not mention function as a abstract its default delcaring.
    public void show();//declare methods as public and default this methods are abstract methods.
    public void rock();

}
class Mock implements Rbi{//interface methods donot have a body .the body is providing by implements class.
   public  void show(){
    }
      public   void rock(){

        }
    

}
