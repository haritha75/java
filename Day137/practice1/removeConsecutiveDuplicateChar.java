public class removeConsecutiveDuplicateChar {

  public static void main(String[] args) {
    String str = "aabbcc";
    System.out.println(removeConsecutiveDupChar(str));
  }

  private static String removeConsecutiveDupChar(String str) {

    if(str.length() <=1)
        return str;

    if(str.charAt(0) == str.charAt(1))
        return removeConsecutiveDupChar(str.substring(1));
    else
        return str.charAt(0) + removeConsecutiveDupChar(str.substring(1));        
    
  }
  
}
