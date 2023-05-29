public class InstanceOfKeywordEx1 {

    public static void main(String[] args) {
        
        Parent p = null;

        if(p instanceof Parent) //return false for null
          System.out.println("p is instance of parent");
        else 
           System.out.println("p is not a instance of parent");   
    }
    
}
class Parent {
    
}