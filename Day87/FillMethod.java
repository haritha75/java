import java.util.Arrays;

public class FillMethod {

    public static void main(String[] args) {

        int a[] = new int[6];

        Arrays.fill(a,8); //default it print all values 8.
        System.out.println(Arrays.toString(a));

        Arrays.fill(a,1,5,4); //here 1st to 5th index it print 4 values remaining default values.
        System.out.println(Arrays.toString(a));
    }
}
