import java.util.Arrays;
//deeptostring is used to it print two dimensional values without loop.
public class DeepToString {

    public static void main(String[] args) {

        int  a[] = {5,9,7,3,8};

        int a1[][] = {

                {5,9,2,5},
                {7,9,2,4},
                {6,4,1,0,}

        };

        System.out.println(Arrays.toString(a)); // it works one dimensional array

        for(var x:a1) {
            System.out.println(Arrays.toString(x)); //if you want two dimensional array values do like this  and also have another method that is called deetostring.
        }


        System.out.println(Arrays.deepToString(a1)); //in above we are using loop but here without loop we are prinitng the values.


    }
}
