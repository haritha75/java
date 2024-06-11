public class ConvertStringToInteger {

  public static void main(String[] args) {
    
    String str = "1234";
  System.out.println( convertStrToInt(str));
 // System.out.println(convertStrToInt(str));
 // System.out.println((int)'0'); //  48 ascill value
  }

// public static int convertStrToIntEx(String str) {
//   if(str.length()==1)
//     return str.charAt(0)-'0';
//
//     int smallOutput = convertStrToIntEX(str.substring(0, str.length()-1));
//     int lastDigit = str.charAt(str.length()-1)-'0'; //here taking last character
//     return smallOutput*10+lastDigit;
//
//
// }
 public static int convertStrToInt(String str) {

      if(str.length()==1)
          return str.charAt(0)-'0';

      int current =  (str.charAt(0)-'0')*(int)Math.pow(10, str.length()-1);

      return current+convertStrToInt(str.substring(1));
 }
  
}
