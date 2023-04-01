//Given a string, compute recursively a new string where all the adjacent chars are now separated by a "*".
 public class AllStar
 {
 public static void main(String args[])
 {
 String str="hello";
 String res=allStar(str);
 System.out.print(res);
 }
 static String allStar(String str)
 {
 if(str.length()<2)
 return str;
 return str.charAt(0)+"*"+allStar(str.substring(1));
 }
 }
