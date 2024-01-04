public class PrintThePermutations {

  public static void main(String[] args) {
    String str = "agi";
    printPermutations(str, "");
  }

  private static void printPermutations(String input, String output) {
    if (input.length() == 0) {
      System.out.println(output);
      return;
    }

    for (int i = 0; i < input.length(); i++) {
      char currentChar = input.charAt(i);
      String remainingChars = input.substring(0, i) + input.substring(i + 1);
      printPermutations(remainingChars, output + currentChar);
    }
  }
}
