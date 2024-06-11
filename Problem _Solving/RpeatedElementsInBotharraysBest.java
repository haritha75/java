public class RpeatedElementsBest {
    public static void main(String[] args) {
        int a[]={3,5,6,8};
        int b[]={2,3,4,6,7,8,8};
        Duplicates(a,b);
       
    }

    public static void Duplicates(int a[],int b[]) {

        int i=0,k=0,j=0;
        while(i<a.length&&j<b.length) {

            if(a[i]==b[j]) {
                System.out.print(a[i]+" ");
                i++;
                j++;
            }

            else if(a[i]<b[j]) {
                i++;
            }
            else {
                j++;
            }
        }

    }
}