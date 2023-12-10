public class SumofArrayusingRecursion {

    public static void main(String[] args) {
        
        int a[]={2,3,5,16};
        int res= sum(a);
        System.out.println(res);
    }
    public static int  sum(int a[]){
       
        if(a.length<=0)
          return 0;

       
        
        int arr[]=new int[a.length-1];
        for(int i=1;i<=arr.length;i++)
           arr[i-1]=a[i];  
        int res=a[0]+sum(arr);   

        return res;
    }
          
      
}
