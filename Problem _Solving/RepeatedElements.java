public class RepeatedElements {
    public static void main(String[] args) {
        int a[]={3,5,6,8};
        int b[]={2,3,4,6,7,8,8};
        Duplicates(a,b);
       
    }

    public static void Duplicates(int a[],int b[]) {

        for(int i=0;i<a.length;i++) {
            for(int j=0;j<b.length;j++) {
                if(a[i]==b[j]) {
                    System.out.print(a[i]+" ");
                    break;
                }
            }
        }
        

    }
    
}
