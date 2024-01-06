import java.util.Arrays;

public class ReturnAllcodes {

  public static void main(String[] args) {
    String str =" 1123";
    String a[] = getCode(str);

   
    System.out.println(Arrays.toString(a));
   
  }
  public static char getChar(int n) {
    return (char) (96+n);
  }
  public static String[]  getCode(String input) {

    if(input.length()==0) {
      String output[] = {""};
      return output;
    }

    int firstDigit = (input.charAt(0)-'0');
    String[] smallOut1 = getCode(input.substring(1));
    String[] smallOut2=new String[0];

    int firsTwodigits= 0;
    if(input.length() >=2) {
      firsTwodigits = (input.charAt(0)-'0')*10+(input.charAt(1)-'0');
      if(firsTwodigits >=10 && firsTwodigits<=26) {
        smallOut2 = getCode(input.substring(2));
      }
    }
    String output[] =new String[smallOut1.length+smallOut2.length];
    int k=0;

    for(String s: smallOut1) {
      char firstDigitChar = getChar(firstDigit);
      output[k]=firstDigitChar+s;
      k++;
    }
    for(String s: smallOut2) {
      char firstTwoDigitChar = getChar(firsTwodigits);
      output[k]=firstTwoDigitChar+s;
      k++;
    }
    return output;

  }
  
}
