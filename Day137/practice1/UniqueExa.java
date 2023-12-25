public class UniqueExa {

  public static void main(String[] args) {
    
    int a[] ={2,3,1,6,3,6,2};
    int res =0;
    for(int i=0;i<a.length;i++) {
      res ^=a[i];
    }
    System.out.println(res);
  }
  
}
