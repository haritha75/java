public class MakeOutWord {

  public static void main(String[] args) {
    
    System.out.println(makeOutWord("<<>>", "Yay"));

  }
  public static  String makeOutWord(String out, String word) {

    String res="";
    String s1=out.substring(0,2);
    String s2=out.substring(2,4);
    return s1+word+s2;
  }
  
  
}
