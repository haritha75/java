public class StrObjAndStrLiterals {

    public static void main(String[] args) {
        

        long start1 = System.currentTimeMillis();
        String str="";

        for(int i=0;i<100000;i++) {

            str="hello"; //it takes less time because it is a same value so it will not create new value in the string pool it just assign same value.if you change string then it will effect to other objects also.string is immutable not changing or modifiying anything but  add new things or values.

        }

        long end1 = System.currentTimeMillis();
        System.out.println(end1-start1);



        long start2 = System.currentTimeMillis();
        String str2 = "";

        for(int j=0;j<100000;j++) {

            str2 = "hello"+String.valueOf(j); // it takes more time it also same string pool but every time adding new value .so not same value then it create new copy in the string pool.
        }

        long end2 = System.currentTimeMillis();
        System.out.println(end2-start2);


        long start3 = System.currentTimeMillis();
        String str3 = "";


        for(int k=0;k<100000;k++) {

            str3 = new String("hello"); //it also take time because everytime create new value inside string pool because it is a string object.

        }

        long end3 = System.currentTimeMillis();
        System.out.println(end3-start3);
    }
}