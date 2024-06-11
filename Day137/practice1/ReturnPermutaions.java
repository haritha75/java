import java.util.Arrays;

public class ReturnPermutaions {

  public static void main(String[] args) {
    
    String str = "adg";
    
    String anw[] = permutaionOfString(str);
    
    for(int i=0;i<anw.length;i++) {
      System.out.println(anw[i]);
    }

  }

  public static String[] permutaionOfString(String input) {

    if(input.length()==0) {
      String output[] = {""};
      return output;
    }

    String smallOutput[] = permutaionOfString(input.substring(1));
    // System.out.println(input.length()+" "+smallOutput.length);

    String output[] = new String[input.length() * smallOutput.length];

    int k=0;

    for(int i=0;i<smallOutput.length;i++) {
      String currentString = smallOutput[i];
      // System.out.println(currentString.length());

      for(int j=0;j<=currentString.length();j++) {
        // System.out.println(currentString.substring(0, j)+input.charAt(0)+currentString.substring(j)+" "+k);
        output[k] = currentString.substring(0, j)+input.charAt(0)+currentString.substring(j);
        k++;
      }
      System.out.println();
    }
    return output;

  }
  
}

