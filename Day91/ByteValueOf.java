import java.util.BitSet;

public class ByteValueOf {

    public static void main(String[] args) {
        
        byte arr[] = {2,4}; //here each value takes 8 bits then it will store in binary form then it return setbit index. 
         
        BitSet bitSet = BitSet.valueOf(arr);

        System.out.println(bitSet);

        byte arr1[] = {1,4,7};

        BitSet bitSet2 = bitSet.valueOf(arr1);
        System.out.println(bitSet2);
    }
    
}
