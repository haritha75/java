import java.lang.*;

public class WrapperClassStr {

    public static void main(String[] args) { 
        
        String res = Integer.toBinaryString(23456); //it converting into binary string.

        System.out.println(res+6789);
        
        System.out.println(Integer.toString(9764)); // it converting into string.

        String res4 = Integer.toHexString(9854); // it convert into hexstring.
        System.out.println(res4);


        int res1 = Integer.parseInt("78954");
        float res2 = Float.parseFloat("345.78");

        System.out.println(res1);
        System.out.println(res2);

       int res5 = Integer.reverse(123);
       int res6 = Integer.sum(76,90); //summing the values.
       System.out.println(res5);
       System.out.println(res6);

    }
    
}
