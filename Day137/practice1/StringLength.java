public class StringLength {
  
  public static void main(String[] args) {
    
    String str = "abc";
    int k=2;
   stringOfLengthK(str,k,"");
  }
  private static void stringOfLengthK(String str, int k, String ans) {
    
    if(ans.length()==k) {
        System.out.println(ans);
        return;
    }
    for (int i = 0; i < str.length(); i++) {
        stringOfLengthK(str,k,ans+str.charAt(i));
    }
}

  
}
