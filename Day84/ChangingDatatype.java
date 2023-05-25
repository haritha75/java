import java.util.Arrays;

public class ChangingDatatype {

    public static void main(String[] args) {

        Object[] x = mock(); //here we are creating object with the help of object because it is parent of all the classes.

        System.out.println(Arrays.toString(x));

    }


    public static Integer[] mock() {

        Integer[] a = {3,5,7,9}; //here array datatype is integer type
        return a;
    }

}

