public class FindDifference {

  public static void main(String[] args) {
    
    int a[] = {5,20,3,2,50,80};
    //int a[] = {90,70,20,80};
  //  int n=45;
    int n=78;

    boolean flag = true;
    for(int i=0;i<a.length-1;i++) {
      for(int j=i+1;j<a.length;j++) {
       
          int diff = Math.abs(a[i]-a[j]);
          if(diff==n) {
            System.out.println(a[i]+" "+a[j]);
            flag = false;
            return;
          }
        } 
      }
    
    if(flag)
    System.out.println("no Such Pair");
    

  }
  
}
