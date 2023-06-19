public class ByteTypeEx {

    public static void main(String[] args) {
        
        for(int i = 512;i<1024;i++) {

            byte temp = (byte) i; //byte range -128 to 127 whenever over the range overflowing will be happening
            System.out.println(temp);

        }
    }
    
}
