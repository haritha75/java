public class OneSortedAndOneUnSorted {
    public static void main(String[] args) {

        int a[]={3,5,7,9,13};
        int b[]={19,17,5,9,4,3,2,1};

        int res[]=sortedMerge(a, b);
        for(int i=0;i<res.length;i++) {
            System.out.print(res[i]+" ");
        }
        
    }
    static int[] sortedMerge(int a[],int b[]) {
        int i=0,j=b.length-1,k=0;
        int res[]=new int[a.length+b.length];

        for(;i<a.length && j>=0;) {
            if(a[i]<=b[j])
             res[k++]=a[i++];
            else 
              res[k++]=b[j--]; 
        }
        while(i<a.length){
            res[k++]=a[i++];
        }
        while(j>=0) {
            res[k++]=b[j--];
        }
        return res;

    }
}
