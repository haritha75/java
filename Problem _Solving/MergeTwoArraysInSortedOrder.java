public class MergeTwoArraysInSortedOrder {
    public static void main(String[] args) {

        int a[]={3,5,7,9,13};
        int b[]={1,2,3,4,9,15,17,19};
        int res[]=sortedMerge(a, b);
        for(int i=0;i<res.length;i++) {
            System.out.print(res[i]+" ");
        }
        
    }
    static int[] sortedMerge(int a[],int b[]) {
        int i=0,j=0,k=0;
        int res[]=new int[a.length+b.length];

        for(;i<a.length && j<b.length;) {
            if(a[i]<=b[j])
             res[k++]=a[i++];
            else 
              res[k++]=b[j++]; 
        }
        while(i<a.length){
            res[k++]=a[i++];
        }
        while(j<b.length) {
            res[k++]=b[j++];
        }
        return res;

    }
    
}
