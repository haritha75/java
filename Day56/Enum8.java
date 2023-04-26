public class Enum8 {

    public static void main(String[] args) {
        

        Weekdays w = Weekdays.THURSDAY;

        switch(w) {

            case MONDAY:
              System.out.println("monday");
              break;

            case TUESDAY:
              System.out.println("tuesday");  
              break;

            case WEDNESDAY:
              System.out.println("wenesday");   
              break;

            case THURSDAY:
              System.out.println("thursday");  
              break; 

            case FRIDAY:
              System.out.println("friday");  
              break;

            case SATURDAY:
              System.out.println("saturday");  
              break;

            case SUNDAY:
              System.out.println("sunday");   
              break;
        }
    }
    
}
 enum Weekdays {

    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY

 };