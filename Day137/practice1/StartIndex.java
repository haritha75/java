public class StartIndex {

  public static void main(String[] args) {
    
    int a[] = {8,1,10,8};
    int n = 8;
    System.out.println(returnfirstIndex(a,n,0));
    System.out.println(returnlastIndexOccurence(a,a.length-1,n));
    allIndexes(a, 0, n);
  }

  public static int returnfirstIndex(int a[],int n,int StartIndex) {
    if(StartIndex == a.length)
    return -1;
    if(a[StartIndex]==n)
      return StartIndex;

      int res = returnfirstIndex(a, n, StartIndex+1);
      return res;
  }

  public static int returnlastIndexOccurence(int a[],int end,int n) {

    if(end<0)
    return -1;
    if(a[end]==n)
     return end;

     return returnlastIndexOccurence(a,end-1,n);  

  }

  public static void allIndexes(int a[],int StartIndex,int n) {

    if(StartIndex == a.length)
    return;
    if(a[StartIndex]==n)
      System.out.print(StartIndex+" ");

      allIndexes(a, StartIndex+1, n);
  }
}
