public class WrapperClass1 {

    public static void main(String[] args) {
        
        Integer s = 35;
        Integer d = new Integer(9);
        Integer c = s+d;
        System.out.println(c);

        int sum = 200;
        Integer d1 = sum+400; // here we are combining int datatype variable and wrapper class.
        System.out.println(d1);

        Integer to = 456;
        int a = to+398; //here we are storing wraper class value into int datatype.
        System.out.println(a);
    }
    
}
