public class Sample {
  public static void main(String[] args) {

    char ch[][] ={
      {'A','B','C','E'},
      {'S','F','C','S'},
      {'A','D','E','E'}

    };
    String word = "ABCCEG";
    boolean ch1 =  test(ch,word);
    System.out.println(ch1);

    }
    
  
  public static boolean test(char ch[][],String word) {
     int count=0;
     int cur = 0;
      for(int j=0;j<ch.length;j++){
        for(int k=0;k<ch.length;k++) {
          if(word.charAt(cur++)==ch[j][k]){
            count++;
          }

        }
      }
      return word.length() == count;

    }
  

  }

