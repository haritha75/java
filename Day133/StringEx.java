public class StringEx {

    public static void main(String[] args) {
        
        String str="hello";
        String s1="hello";
        String s2=new String("hello");

        System.out.println(str.hashCode());
        System.out.println(s1.hashCode());

        System.out.println(str==s1); //true because both are stored in stirng pool so pointing to the same value and it return same address

        System.out.println(s1==s2);//false s1 stored in string pool and s2 inside the string so different address
        System.out.println(s1.equals(s2));

        System.out.println(s2.hashCode());


    }
    
}
