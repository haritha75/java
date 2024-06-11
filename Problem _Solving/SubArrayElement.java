public class SubArrayElement {

    public static void main(String[] args) {
        
        int a[]={2,4,6,8,1,3,5,7,9};
        int size=3;
        Subarray(a,size);
    }
    public static void Subarray(int[] a,int size) {
        

        for(int i=0;i<a.length-size;i++) {
            for(int j=i;j<size+i;j++) {
                System.out.print(a[j]+" ");
            }
            System.out.println();
        }
    }
    
}
