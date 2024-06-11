public class Sample {

  public static void main(String[] args) {
    

    String input = "hi hello everyone";
    int end = input.length();
    int i;
    String output="";
    for( i=end-1;i>=0;i--) {
      if(input.charAt(i)==' ') {
        output = output+input.substring(i+1, end)+" ";
        end =i;
      }


    }
    output +=input.substring(i+1, end);
    System.out.println(output);

  }
  
}
