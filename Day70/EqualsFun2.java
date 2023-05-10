public class EqualsFun2 {

    public static void main(String[] args) {

        Duck d1 = new Duck();
        d1.age = 21;
        d1.weight = 54.67;

         Duck d2 = new Duck();
         d2.age = 23;
         d2.weight = 34.67;
         
         System.out.println(d1.equals(d2));
         System.out.println(d1==d2);
        
    }
    
}
class Duck  {

   public  int age;
    double weight;
}