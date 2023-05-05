//when converting from one format to another format if you give wrong  type format  that time it happens.

public class NumberFormatException11 {

    public static void main(String[] args) {
        
        String s = "xyz";

        try {
            int x = Integer.parseInt(s); //here we converting string into integer here we are given wrong type means given xyz that means it not convert int type.

        }
        catch(NumberFormatException e) {

            System.out.println(e.getMessage());
        }
    }
    
}
