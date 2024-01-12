public class RemoveCharEx {

  public static void main(String[] args) {


    System.out.println(removeX("xabxxab"));

    System.out.println(removeX1("xabxxab",0));

    System.out.println(replaceCharacter("abcba"));

    System.out.println(replaceCharacter1("abcba",0));
    System.out.println(removeDup("aabccba"));
    

  }
  public static String removeX(String str) {

    if(str.length()==0) {
      return str;
    }

    String ans = "";

    if(str.charAt(0)!='x')
     ans +=str.charAt(0);

   String res = removeX(str.substring(1));

   return ans+res;

    

  }

  public static String removeX1(String str,int start) {

    if(start==str.length())
      return "";

      String ans ="";

      if(str.charAt(start)!='x')
         ans += str.charAt(start);

      String res = removeX1(str,start+1);   

      return ans +res;
  }

  public static String replaceCharacter(String str) {

    if(str.length()==0)
      return "";

    String ans ="";
    
    if(str.charAt(0)=='a') 

       ans +="x";
    else
       ans +=str.charAt(0);
       
    String res = replaceCharacter(str.substring(1));
    
    return ans+res;

    
  }

  public static String replaceCharacter1(String str,int index) {

    if(index == str.length())
      return "";

      String ans ="";

      if(str.charAt(index)=='a')
         ans +="x";
      else 
         ans +=str.charAt(index);
         
     String res = replaceCharacter1(str,index+1);
     
     return res+ans;

  }

  public static String removeDup(String str) {

    if(str.length()<=1)
      return str;

   String ans ="";
   
   if(str.charAt(0)!=str.charAt(1))
      ans +=str.charAt(0);

   String res = removeDup(str.substring(1));
   
   return res+ans;
  }
}