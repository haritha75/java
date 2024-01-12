public class PrintAllCodes {

  public static void main(String[] args) {
    

    String str = "1123";
    printAllPossibleCodes(str);
  }

  public static void printAllPossibleCodes(String str) {

    printAllPossibleCodes(str,"");

  }

  private static void printAllPossibleCodes(String str, String output) {


    if(str.length() ==0) {
      System.out.println(output);
      return;
    }

    int firstDigit = str.charAt(0) - '0';

    printAllPossibleCodes(str.substring(1),output+getChar(firstDigit));

    if(str.length()>1) {

      int firstTwoDigit = (str.charAt(0)-'0') *10 + (str.charAt(1)-'0');

      if(firstTwoDigit >= 10 && firstDigit <=26) {

        printAllPossibleCodes(str.substring(2),output+getChar(firstTwoDigit));
      }
    }
  }

  private static char getChar(int digit) {
    return (char)(digit+96);
  }
}