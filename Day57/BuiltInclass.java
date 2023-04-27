public class BuiltInclass {

    public static void main(String[] args) {

        System.out.println(Integer.MAX_VALUE); //here we are using integer class with static variable.so thats why with the help of class we are printing static variable.
        

        System.out.println(BuiltInclass.toBinaryString(15)); //15 will convert integer into binary string.

        System.out.println(BuiltInclass.toHexString(15));

        BuiltInclass w = new BuiltInclass(4); //here integer is a class name.built in class
        System.out.println(w);

        Float f = new Float(54.22); //float is also class name and built in class.
        System.out.println(f);
    }
    
}
