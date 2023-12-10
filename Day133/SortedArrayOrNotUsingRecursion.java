public class SortedArrayOrNotUsingRecursion {

    public static void main(String[] args) {
        

        int a[]={2,5,7,9};

        boolean res= sorted(a);
        System.out.println(res);
    }
    public static boolean sorted(int a[]) {

        if(a.length<=1)
          return true;
        if(a[0]>a[1])
           return false;
        
           int arr[]=new int[a.length-1];
           for(int i=1;i<=arr.length;i++) {

            arr[i-1]=a[i];

           }
           boolean res = sorted(arr);

           return res;

    }
}
