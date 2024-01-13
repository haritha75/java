public class countX {

  public static void main(String[] args) {
   System.out.println(
           countX("xxhxex"));
  }
  public static int countX(String str) {
    int count=0;
    if(count==str.length())
    {
    return 0;
    }
    if(str.charAt(count)==('x'))
    {
      count++;
    }
    return count+countX(str.substring(1));
  }
  
  
}
