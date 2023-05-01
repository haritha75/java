import java.math.BigDecimal;

public class BigDecimalExam {

    public static void main(String[] args) {
        

        BigDecimal a = new BigDecimal("0.04");
        BigDecimal b = new BigDecimal("-0.08");

        BigDecimal a1 = a.add(b);
        System.out.println(a1);

        BigDecimal a2 = a.abs();
        System.out.println(a2);

        System.out.println(a.compareTo(b));

        System.out.println(a.equals(b));
        System.out.println(a.subtract(b));
        System.out.println(b.divide(a));
        System.out.println(a.max(b));
        System.out.println(a.min(b));
        System.out.println(a.multiply(b));
        System.out.println(a.remainder(b));
        System.out.println(a.byteValue());
       // System.out.println(a.sqrt(null));
        System.out.println(a.intValue());
        System.out.println(b.plus());
        System.out.println(a.toBigInteger());
    }
    
}
