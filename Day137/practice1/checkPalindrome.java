public class checkPalindrome {

  public static void main(String[] args) {
    
    String str = "mada";
    System.out.println(isStringPalindrome(str));
  }

  static boolean isStringPalindrome(String str) {
  
    if(str.length() <= 1)
      return true;
    if(str.charAt(0) ==  str.charAt(str.length()-1)) {
      return isStringPalindrome(str.substring(1, str.length()-1));
    }  
    return false;
  }
  
}
