import java.util.Arrays;

public class AlternativeArray {

    public static void main(String[] args) {

        int n = 5;
        int a[]=new int[n];

        int left =0,right=a.length-1,counter =1;

        for(int i=0;i<n;i++) {


            if(counter%2!=0) {
                 a[left] = counter;
                 counter +=1;
                 left++;
            }
            else {

                a[right]= counter;
                counter +=1;
                right--;
            }
        }
        
        System.out.println(Arrays.toString(a));
    }
}

