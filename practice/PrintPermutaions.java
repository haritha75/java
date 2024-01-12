public class PrintPermutaions {

  public static void main(String[] args) {
    
    String str = "cba";

    PrintPermutaions(str,"");
  }

  private static void PrintPermutaions(String str,String output) {

    if(str.length()==0) {
      System.out.println(output);
      return;
    }

    for(int i=0;i<str.length();i++) {
      char curr = str.charAt(i);

      String rem = str.substring(0, i)+str.substring(i+1);

      PrintPermutaions(rem, output+curr);
    }
  }
  
}
