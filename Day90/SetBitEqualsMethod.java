import java.util.BitSet;
//equals method return false if the length of the sets of bitset are not equals to the length of bitsset object or even all the index of bitset are not quals to the index of bitset object.
public class SetBitEqualsMethod {


    public static void main(String[] args) {
        

        BitSet bitSet = new BitSet(3);
        bitSet.set(0);
        bitSet.set(1);
        bitSet.set(2);
        bitSet.set(3);

        BitSet bitSet2 = new BitSet();
        bitSet2.set(0);
        bitSet2.set(1);
        bitSet2.set(3);

        Object object = new BitSet();

        ((BitSet) object).set(0);
        ((BitSet) object).set(2);
        ((BitSet) object).set(1);
        ((BitSet) object).set(3);


        System.out.println(bitSet);
        System.out.println(bitSet2);
        System.out.println(object);

        System.out.println(bitSet.equals(bitSet2));
        System.out.println(bitSet.equals(object));
        System.out.println(object.equals(bitSet2));




    }
    
}
