public class StrFun {

public static void main(String[] args) {
     
    String str = "haritha";
    String str1 = "haritha";
    String str2 = new String("haritha"); //it stored in inside string pool so address is different.

    System.out.println(str==str1); //it actually equals address of the strings and return boolean value.
    System.out.println(str.equals(str1)); //it equals content of the two strings.
    System.out.println(str==str2); 
    System.out.println(str.equals(str2));

    }
}