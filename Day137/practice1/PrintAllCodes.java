public class PrintAllCodes {

  public static void main(String[] args) {
    String str = "1123";
    printAllPossiblesCodes(str);
  }

  private static void printAllPossiblesCodes(String input) {

    printAllPossiblesCodes(input,"");
  }

  private static void printAllPossiblesCodes(String input, String output) {

    if(input.length()==0) {
      System.out.println(output);
      return;
    }

    int firstDigit = input.charAt(0) - '0';
    printAllPossiblesCodes(input.substring(1),output+getChar(firstDigit));

    if(input.length() > 1) {
      int firstTowDigit = (input.charAt(0) - '0') * 10 + (input.charAt(1)-'0');

      if(firstTowDigit >= 10 && firstTowDigit <= 26) {
        printAllPossiblesCodes(input.substring(2),output+getChar(firstTowDigit));
      }
    }
  }

  private static char getChar(int firstDigit) {

    return (char) (firstDigit+96);
  }
  
}
