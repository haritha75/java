import java.util.BitSet;
public class ToLongArray {
    public static void main(String[] args) {

        BitSet b1 = new BitSet();
        b1.set(1);
        b1.set(4);
        b1.set(64);
        b1.set(128);
        b1.set(192);

        long arr[] = b1.toLongArray(); //each long contains 64 bits from 0 to 63 index that will be the arr[0].whenver set 64 value again creating 64 bits to that array and that values all are means 64 to 127 index will be the arr[1].angain 128 index creating again 64 bits then 128 to 191 will be the arr[2].
        System.out.println(arr.length);
        System.out.println(arr[0]); //arr 0 index contain 0 to 63 index values.
        System.out.println(arr[1]); //it contain 64 to 127.whatever given value will be store that index and again start 2 power 0  and counting in which place value stored that will be printed means position of the value will be printed.
        System.out.println(arr[2]); //it contains 128 to 191.here it start 128 and 128 value stored in first then that postiion is 2 power 0 so it will return 1.
        System.out.println(arr[3]); //this is also start index 192  so it stored in first that values also 2 power 0  so return 1.

    }
}
