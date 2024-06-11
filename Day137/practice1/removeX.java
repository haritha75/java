public class removeX {

  public static void main(String[] args) {
    
   
    String str = "xabxxab";
  // String res = removeXMethod(str);
  // System.out.println(res);
    String str1 = "abbca";
   System.out.println(replacecharacteer(str1));
   System.out.println(replacecharacteer(str1,0));
   System.out.println(removeDuplicates("aabccba"));

   System.out.println(removeConDup("aabbcca", 0));
   System.out.println(removeXMethod1("xabx",0));
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
public static String removeXMethod1(String str,int start) {
 if(start==str.length())
  return "";
  String asw="";
  if(str.charAt(start)!='x')
   asw +=str.charAt(start);

   String res = removeXMethod1(str,start+1);
   return asw+res;
}

public static String replacecharacteer(String str) {
 if(str.length()==0) {

   return str;
 }

 String anw = "";
 if(str.charAt(0)!='a')
 anw +=str.charAt(0);
 else
    anw +="x";
  String res = replacecharacteer(str.substring(1));
  return anw+res;

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
//
public static String removeDuplicates(String str) {

  if(str.length()<=1)
   return str;

   String answer ="";
   if(str.charAt(0)!=str.charAt(1))
    answer +=str.charAt(0);

    String res  = removeDuplicates(str.substring(1));

   return res+answer;
}

public static String removeConDup(String str, int start) {
  if (start == str.length() - 1) {
      return str.substring(start);
  }

  String ans = "";
  if (str.charAt(start) != str.charAt(start + 1)) {
      ans += str.charAt(start);
  }

  String res = removeConDup(str, start + 1);
  return ans + res;
}


}


