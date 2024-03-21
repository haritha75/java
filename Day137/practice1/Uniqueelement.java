public class Uniqueelement {

  public static void main(String[] args) {
    
    int a[] = {2,3,1,6,3,6,2};
    boolean flag = true;
    for(int i=0;i<a.length;i++) {
      for(int j=0;j<a.length;j++) {
        if(i==j)
         continue;

         else {
          if(a[i]==a[j]) {
          break;
          }
         
         }
       
         System.out.println(a[i]+" ");


      }
    }
  }
  
}
