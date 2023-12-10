public class SortedArrayUsingRecursion {

    public static void main(String[] args) {
        

        int a[]={2,4,6,7};
        boolean res = sorted(a,0);
        System.out.println(res);
    }

    public static boolean sorted(int a[],int startInd) {

        if(startInd>= a.length-1)
          return true;
        if(a[startInd]>a[startInd+1])
          return false;
          
        boolean res = sorted(a, startInd+1);  
        return res;


    }
    
}
