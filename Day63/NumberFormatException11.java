public class NumberFormatException11 {

    public static void main(String[] args) {

        String s ="xyz"; //"137" it also wrong because integer range is 127 but the string is 137 which is out of range.
        try {

            int x = Integer.parseInt(s);
        }
        catch(Exception e) {

            System.out.println(e);
        }
        System.out.println("it happens convert a string with an incorrect format to a numeric value");
    }
}
