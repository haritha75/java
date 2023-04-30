public class StringLiteralsAndStrObj {

    public static void main(String[] args) {

        long s1 = System.currentTimeMillis();

        for(int i=0;i<=10;i++) { // iterating 10 times.

            String s = "haritha"; //string literals.it will be create in inside string pool.if you have already value then it will not create or coping value .just assign that value.
            String s2 = "hari"; //string literals
        }
        long s2 =  System.currentTimeMillis();
        long a = s2-s1;
        System.out.println(a);

        long s3 = System.currentTimeMillis();

        for(int i=0;i<10000;i++) {

            String s5 = new String("haritha"); //string object.it will be outside string pool and inside heap.if you already have a value also copying the new value in the heap.
            String s4 = new String("hari"); //string object
            
        }
        long s6 = System.currentTimeMillis();
        long  b = s6-s3;
        System.out.println(b);


    }
}
