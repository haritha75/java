public class FindSum {

  public static void main(String[] args) {
    
    int a[] = {11,15,26,38,9,10};
    int x = 35;
    boolean flag = true;

    for(int i=0;i<a.length-1;i++) {

      for(int j=i+1;j<a.length;j++) {
        if(a[i]+a[j]==x){
        System.out.println(true);
        flag = false;
        return;
        }
      }
     
     
    }
     if(flag)
      System.out.println(false);
  }
  
}
