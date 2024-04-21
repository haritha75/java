import java.util.HashMap;

public class FirstLetterUpper {

  public static void main(String[] args) {

    HashMap<Integer,Integer>  map = new HashMap<>();

   
    String str = "hi everyone where are from?";
    String res = "";

    for (int i = 1; i < str.length(); i++) {
       if (str.charAt(i - 1) == ' ') {
        res += (char) (str.charAt(i) - 32);
       } else {
        res += str.charAt(i);
       }
    }

    // For the first letter in the string
    res = (char)(str.charAt(0)-32 )+ res;

    System.out.println(res);
  }
}
