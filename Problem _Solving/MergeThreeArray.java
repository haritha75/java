public class MergeThreeArray {
    public static void main(String[] args) {
        int a[]={2,3,4};
        int b[]={5,6,7,8};
        int c[]={9,10,11,12,13};
        int res[]=MergeThree(a,b,c);
        for(int i=0;i<res.length;i++) {
            System.out.print(res[i]+" ");
        }
        
    }
    static int[] MergeThree(int a[],int b[],int c[]) {

        int res[]=new int[a.length+b.length+c.length];
        int i=0,k=0;

       while(k<res.length) {

        if(i<a.length) 
          res[k++]=a[i];
        if(i<b.length)
          res[k++]=b[i];
        if(i<c.length)
          res[k++]=c[i];  
        i++;    

       }
       return res;
    }
}
