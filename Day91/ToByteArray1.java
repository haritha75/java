import java.util.BitSet;

public class ToByteArray1 {

    public static void main(String[] args) {

        BitSet b1 = new BitSet();
        b1.set(1);
        b1.set(4);
        b1.set(8);
        b1.set(11);
        b1.set(16);

        byte arr[] = b1.toByteArray(); //each byte contain 8 bits.index start from 0 to 7 it will be arr[0].whatever set 8th value again creating 8 bits that will be arr[1].
        System.out.println(arr.length); //here 1,4 store in first array or index and next 8,11 stored in second one and then 16 stored in  next one because it store only 8 to 15 values so it will stored in next.
        System.out.println(arr[0]); //here 0 index stored 1,4 values then 1 values position is  2 power 1 and 4 valueposition is 2power 4 so it return  2+16=18.
        System.out.println(arr[1]); //index 1 stored in 8 and 11 .8 values position is 2 power 0 and 11 value position is 2 power 3 then it return 9.
        System.out.println(arr[2]);

    }
}
