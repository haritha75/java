public class removeX {

  public static void main(String[] args) {
    
    String str = "xabxxab";
   String res = removeXMethod(str);
   System.out.println(res);
    String str1 = "abbca";
   System.out.println(replacecharacteer(str1));
   System.out.println(replacecharacteer(str1,0));
   System.out.println(removeDuplicates("aabccba"));
  }
  public static String removeXMethod(String str) {
  if(0==str.length())
   return str;
   String asw="";
   if(str.charAt(0)!='x')
    asw +=str.charAt(0);

    String res = removeXMethod(str.substring(1));
    return asw+res;
}

public static String replacecharacteer(String str) {
  if(str.length()==0)
  return str;
  String anw = "";
  if(str.charAt(0)!='a')
  anw +=str.charAt(0);
  else
     anw +="x";
   String res = replacecharacteer(str.substring(1));
   return res+anw;   

}
public static String replacecharacteer(String str,int start) {
  if(str.length()==start)
  return "";
  String anw = "";
  if(str.charAt(start)!='a')
  anw +=str.charAt(start);
  else
     anw +="x";
   String res = replacecharacteer(str,start+1);
   return res+anw;   

}

public static String removeDuplicates(String str) {

  if(str.length()==0)
   return str;

   String answer ="";
   for(int i=0;i<str.length()-1;i++) {
    for(int h=i+1;h<str.length();h++) {
      if(str.charAt(i)==str.charAt(h))
      break;
    }
    answer +=str.charAt(i);
   }
   String res = removeDuplicates(str.substring(1));
   return res+answer;
}

}
