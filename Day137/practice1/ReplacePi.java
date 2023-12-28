public class ReplacePi {

  public static void main(String[] args) {
    String str = "xpiapi";
    System.out.println(replace(str));
   System.out.println(replacePi(str));

  }
  public static String replace(String str) {
    String output;
    if(str.length()<=1){
      return str;
    }
    String small = replace(str.substring(1));
    if(str.charAt(0)=='p' && small.charAt(0)=='i'){
      output = "3.14"+small.substring(1);
    }
    else{
      output = str.charAt(0)+small;

    }
    return output;
  }

 public static String replacePi(String str ) {

   if(str.length()<=1)
     return str;

   if(str.charAt(0)=='p'&&str.charAt(1)=='i' && str.length()>=2)
     return "3.14"+replacePi(str.substring(2));
   return str.charAt(0)+replacePi(str.substring(1));
 }
  
}
