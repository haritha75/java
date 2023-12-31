public class ExcelColumnName {

  public static void main(String[] args) {

    int n = 705;

    printcolumnName(n);
    
  }
  public static void printcolumnName(int n) {

    String str = "";
    while(n>0) {

      int rem = n%26;
      if(rem==0) {

        str ="Z"+str;
        n = (n/26)-1;
      }
      else{

        str  = ((char) ((rem-1)+'A'))+str;
        n = n/26;
      }
    }
    System.out.println(str);
  }
  
}
