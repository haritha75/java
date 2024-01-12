public class ReturnPermutaions {

  public static void main(String[] args) {
    
    String str = "abc";

    String ans[] = permutaionOfString(str);

    for(int i=0;i<ans.length;i++) {
      System.out.println(ans[i]);
    }
  }

  private static String[] permutaionOfString(String str) {
    
    if(str.length()==0) {
      String output[] = {""};
      return output;
    }


    String smallOutput[] = permutaionOfString(str.substring(1));

    String output[] = new String[str.length()*smallOutput.length];

    int k=0;

    for(int i=0;i<smallOutput.length;i++) {

      String currentString = smallOutput[i];

      for(int j=0;j<=currentString.length();j++) {

        output[k] = currentString.substring(0, j)+str.charAt(0)+currentString.substring(j);
        k++;
      } 

    }

    return output;
  }
  
}
