public class StrToByte {

    public static void main(String[] args) {

        String x = "123";
        String a = "12346895674";

        byte b = Byte.parseByte(x);
        System.out.println(b);

        for(byte i =0;i<a.length();i++) {
            byte c = Byte.parseByte(String.valueOf(a.charAt(i)));
            System.out.println(c);
        }

    }
}
