import java.lang.*;
public class StrLiteralVsStrObj {

    public static void main(String[] args) {
        String a[] = new String[10000000];
        long start = System.currentTimeMillis();

        for(int i=0;i<a.length;i++) 
        a[i] = "rock";

        long end = System.currentTimeMillis();
        System.out.println(end-start+"ms");


        String a1[] = new String[10000000];
        long start1 = System.currentTimeMillis();

        for(int i=0;i<a.length;i++) 
        a1[i] = new String("rock");

        long end1 = System.currentTimeMillis();
        System.out.println(end1-start1+"ms");
    }
    
}
