public class Smallest {
    public static void main(String[] args) {
        int a[]={99,23,66,12,77,88,34,66,22,7,33,56,90,11};
        int min=a[0];
        int c=0;
        for(int i=0;i<a.length;i++){
            if(a[i]<min)
            {
                c++;
            min=a[i];
            }
            System.out.println(c);

        }
        System.out.println(min);

    }
    
}
