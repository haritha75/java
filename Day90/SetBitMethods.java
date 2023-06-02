import java.util.BitSet;
 //setbit size is initial 64 bit whenver you are adding the more than 64 that time it will increases again 64 bits like that keep on increases whenever adding more values.
public class SetBitMethods {

    public static void main(String[] args) {


        BitSet bitSet = new BitSet(150); //here intially 64 bits then and increases 64 means 128 bits then again increases 64 then it will be 192 bits.so size will be 192. 

        System.out.println(bitSet); //intially all values are false.
        System.out.println(bitSet.length());
        bitSet.set(0,80,true); //here 0 to 80 values are true remaning false.
        System.out.println(bitSet.size()); //how many will have that will be the size.
        System.out.println(bitSet.length()); //means whatever setting lastindex of the value then it will be printed lastindex of next value.
        bitSet.clear(6);
        System.out.println(bitSet.get(6)); //it shows false because we are clearing that value.
        bitSet.set(6);
        System.out.println(bitSet.get(6));
        bitSet.set(0,200,true);
        bitSet.set(195);
        System.out.println(bitSet.size()); //if you increase values more than size and again it increase size also.
        System.out.println(bitSet.length());

        BitSet bitSet2 = new BitSet();

        bitSet2.set(2);
        bitSet2.set(17);
        bitSet2.set(63);


        BitSet bitSet3 = new BitSet();
        bitSet3.set(4);
        bitSet3.set(17);
        bitSet3.set(61);

        bitSet2.and(bitSet3); //if both have same values it return that values.
        System.out.println(bitSet2);

        bitSet3.or(bitSet2); // atleast one value will be 1 in both bitsets it return that values.
        System.out.println(bitSet3);

        bitSet3.xor(bitSet2); //in both bitsets have different values that values will be return.
        System.out.println(bitSet3);

        System.out.println(bitSet3.cardinality()); //it return how many bits bitset3 occupies.

        bitSet.andNot(bitSet3); //this method clear the entire bit in bitset whose cooresponding bit is set in the specified bitset.
        System.out.println(bitSet);


        bitSet.clear(0, 7); //it clear the entire bit from 0 to 7th index.
        System.out.println(bitSet);

        System.out.println(bitSet3.equals(bitSet2));//this  method is used to compare the current object with the specified object.if length same it return true or all index of bits are same return true.


        bitSet3.flip(4); //it set the bit to complement value means 0 to 1 and 1 to 0.
        System.out.println(bitSet3);

        bitSet.flip(20, 30); //it set complementary value from 20 to 30 index.
        System.out.println(bitSet);

        bitSet3.intersects(bitSet); //it return true if specified bitset set value is also true in this bitset set value.
        System.out.println(bitSet3);

        System.out.println(bitSet.isEmpty());

        System.out.println(bitSet3.nextClearBit(61)); //it returns the index of first bit which is set to false that occurs on or after specified index. here 61 is true it returns next index if that is false.
        System.out.println(bitSet3.nextSetBit(61)); //it returns the index of first bit which is set to true that occurs on or after specified index.here 61 is true because we have 61 index or bit.
        System.out.println(bitSet.previousClearBit(62)); //it returns the index of the nearest bit which is set to false which occurs on or before the specified index.
        System.out.println(bitSet.previousSetBit(61)); //it returns the index of the nearest bit which is set to ture which occurs on or before the specified index.








    }
    
}
