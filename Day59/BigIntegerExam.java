
 import java.math.BigInteger;
public class BigIntegerExam {
    
//biginteger is a class is used for mathematical operation and big integer calculation.it has large method library.

    public static void main(String[] args) {

        BigInteger a,b; //initialization

        BigInteger a2 = new BigInteger("875");
         BigInteger a1 = new BigInteger("123");

        BigInteger ad = a1.add(a2);
        System.out.println(ad);

        BigInteger sub = a1.subtract(a2);
        System.out.println(sub);

        BigInteger quot = a1.divide(a2);
        System.out.println(quot);

        BigInteger rem = a1.remainder(a2);
        System.out.println(rem);

        BigInteger mul = a1.multiply(a2);
        System.out.println(mul);

        BigInteger min = a1.min(a2);
        System.out.println(min);

        BigInteger max = a1.max(a2);
        System.out.println(max);

        BigInteger s = new BigInteger("-22");
        BigInteger ab = s.abs();
        System.out.println(ab);

        BigInteger neg = a1.negate();
        System.out.println(neg);

        BigInteger no = a1.not();
        System.out.println(no); 

        int count = a1.bitCount();
        System.out.println(count);

        int len = a1.bitLength(); //it convert 2's complement and bitlength is 7.
        System.out.println(len); 

        System.out.println(a1.equals(a2));
        System.out.println(a2.compareTo(a1));

    

        BigInteger big = new BigInteger("1");
        int n = 8;

        for(int i=2;i<=n;i++) {

        big =big.multiply(BigInteger.valueOf(i));
      }

         System.out.println(big);

  }
}
