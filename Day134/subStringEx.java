public class subStringEx {

  public static void main(String[] args) {
    
    String str = "pqrs";

    for(int i=0;i<str.length();i++) {
      for(int j=i;j<str.length();j++) {
        System.out.println(str.substring(i, j+1));
      }
    }

    System.out.println("length wise:");

    for(int i=1;i<=str.length();i++) { //length
      for(int j=0;j<=str.length()-i;j++) {
         int h=j+i-1;
        System.out.println(str.substring(j, h+1)); 
      }

    }
  }
  
}
