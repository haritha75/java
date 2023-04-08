package example2;

public class Rock {
  public  int age;// it means we can use any package.
  String person;//default modifier it can use same package not another package.
  private int years;//it can use same file not same pakcage or not another file in same  package
  public static void main(String[] args) {
    Rock r2=new Rock();
    System.out.println(r2.years);
    //Freedom f=new Freedom();
    //System.out.println(f.limit);
  }
}
//class Freedom
//{
  //private  int limit;//it is private not use in another class.only use same file
   
//}
