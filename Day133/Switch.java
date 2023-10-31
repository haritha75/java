public class Switch {

    public static void main(String[] args) {
        
        int a=12,b=10;

        switch(a>b) { //here boolean values not allowed in switch statement.

            case 1: 
              System.out.println("hello");
             break; 
            case 2:
            System.out.println("hi.....");  
            break;
            default:
              System.out.println("others");
              break;
        }
    }
    
}
