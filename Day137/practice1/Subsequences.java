public class Subsequences {

  public static void main(String[] args) {
    
    String str = "xyz";
    String anw[] = findSubsequences(str);
    
    for(int i=0;i<anw.length;i++) {
      System.out.println(anw[i]);
    }
  }
  public static String[]  findSubsequences(String str) {

    if(str.length()==0) {
      String ans[] = {""}; //here size is one because we are storing "" it considers one value
      System.out.println(ans.length);
      return ans;
    }

    String smallans[] = findSubsequences(str.substring(1));
    String ans[] = new String[2*smallans.length];

    int k=0;
    for(int i=0;i<smallans.length;i++) {
      ans[k] = smallans[i];
      k++;
    }

    for(int i=0;i<smallans.length;i++) {
      ans[k] = str.charAt(0)+smallans[i];
      k++;
    }

    return ans;
      
  }
  
}
