import java.util.*;

public class UpperBoundedWildCard {


        public static void main(String[] args) {

            List<Float> li = Arrays.asList(7.8f,44.5f,6.54f);
            sum(li);
            List<Integer> li1 = Arrays.asList(3,6,8,9,12,44);
            sum(li1);




        }

        public static void sum(List<? extends Number> a) { //here you mention particular classes not super classes it allows that class and subclasses also.this is upperboundedwildcard expression type.

            float sum = 0;

            for(Number x: a) {
                sum += x.floatValue(); //here if you give int value also converting floating value.
            }

            System.out.println(sum);
        }
    }


