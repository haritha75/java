public class FindSum {

  public static void main(String[] args) {
    
    int a[] = {11,15,26,38,9,10};
    int x = 35;

    for(int i=0;i<a.length-1;i++) {

      for(int j=i+1;j<a.length;j++) {
        if(a[i]+a[j]==x){
        System.out.println(a[i]+" "+a[j]);
        return;
        }
      }
     
    }
  }
  
}
