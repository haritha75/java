//finding which number is closest to the first index value in a galaxy?
import java.lang.*;
import java.math.*;
public class Closest {
    public static void main(String[] args) {
        int a[]={3,6,2,1,8,9,5};
        int min=5;
        int d;
        int i;
        int res=0;
        for(i=1;i<a.length;i++) {
             d=Math.abs(3-a[i]);

             
             if(d<min) {
                min=d;
                res=a[i];
           }
        }
             
        
             System.out.println("distance is "+min+" at index " +res);

    }
}
    

