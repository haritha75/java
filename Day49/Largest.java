//find out largest value in large array.it is example brute force method

public class Largest {
    

    public static void main(String[] args) {
        int a[]={99,23,66,12,77,88,34,66,22,7,33,56,90,11};
        int max=a[6];
        int c=0;
        for(int i=0;i<a.length;i++){
            c++;
            if(a[i]>max)
                 max=a[i];
            

        }
        System.out.println(max);

        System.out.println(c);


    }
    

}