import java.util.BitSet;

public class LongValueOf {
    public static void main(String[] args) {

        long arr[] = {1,3}; //here each value takes 8 bits then it will store in binary form then it return setbit index. 
         
        BitSet bitSet = BitSet.valueOf(arr);

        System.out.println(bitSet);

        long arr1[] = {2,4,7};

        BitSet bitSet2 = bitSet.valueOf(arr1);
        System.out.println(bitSet2);
        
    }
    
}
