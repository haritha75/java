public class ByteMaxValue {

    public static void main(String[] args) {
        
        byte a = (byte) (Byte.MAX_VALUE+2); //here max value is 127 then we are adding 2 then it happens overflowing.
        System.out.println(a);
    }
    
}
