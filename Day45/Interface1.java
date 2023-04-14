public class Interface1 {
    

    public static void main(String[] args) {
        //Mock m=new Mock();//not owking because not implementing all functions.
        //m.show();
        Rock r=new Rock();
        r.show();
        r.rock();
    }
    
}
interface Rbi{//in interfaces class every method abstract function  that means no body so not mention function as a abstract its default delcaring.
    public void show();
    public void rock();
    int x=10;

}
abstract class Mock implements Rbi{//interface methods donot have a body .the body is providing by implements class.here we are mentioning abstract class because we are not implementing all abstract functions.
   public  void show(){
    }
      
}
class Rock extends Mock{//here we are not using abstract class because we are implementing all abstract functions.
   // int x=22;
    public void rock(){
        System.out.println(x);//this variable is interaface variable value.

    }
}
