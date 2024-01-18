public class CharacterReplacer {

  public static String replaceChar(String input, char target, char replacement) {

      if (input.isEmpty()) {
          return "";
      } else {
          char firstChar = input.charAt(0);
          if (firstChar == target) {
              return replacement + replaceChar(input.substring(1), target, replacement);
          } else {
              return firstChar + replaceChar(input.substring(1), target, replacement);
          }
      }
  }

  public static void main(String[] args) {
      String inputString = "Hello, World!";
      char targetChar = 'o';
      char replacementChar = '*';

      String result = replaceChar(inputString, targetChar, replacementChar);

      System.out.println("Original String: " + inputString);
      System.out.println("String after replacement: " + result);
  }
}
