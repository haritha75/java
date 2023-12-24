public class FindDifference {

  public static void main(String[] args) {
    
    int a1[] = {5,20,3,2,50,80};
    int a[] = {90,70,20,80};
    int n=45;
    int n1=78;

    boolean flag = true;
    for(int i=0;i<a.length;i++) {
      for(int j=0;j<a.length;j++) {
        if(i==j)
         continue;
        else {
          if(a[i]-a[j] == n || a[j]-a[i]==n) {
            System.out.println(a[i]+" "+a[j]);
            flag = false;
            return;
          }
        } 
      }
    }
    if(flag)
    System.out.println("no Such Pair");
    

  }
  
}
