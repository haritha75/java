public class ReplaceCharacterUsingRecursion {

    public static void main(String[] args) {
        String str = "bababbc";

        String res = replace(str);
        System.out.println(res);
    }

    public static  String replace(String str) {

        if(str.length()==0)
          return str;

        String asw = "";  
        if(str.charAt(0)=='b'){
          asw +="x";   
          
        }
        else {
          asw  += str.charAt(0);    
          
        }
       
       return asw+replace(str.substring(1));


    }
    
}
