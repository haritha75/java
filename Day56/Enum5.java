public class Enum5 {

    public static void main(String[] args) {
        
        for( var x:Cofee.values()) {

            System.out.println(x);
        } 
    }

    
}
enum Cofee {
     Strong,
     Medium,
     Light
};