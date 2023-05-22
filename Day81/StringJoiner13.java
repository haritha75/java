import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;
import java.util.StringTokenizer;

public class StringJoiner13 {

    public static void main(String[] args) {

        String str = "haritha-ramya-harika-reddy-dilshad";

        StringTokenizer st = new StringTokenizer(str,"-");

        List<String> list = new ArrayList<>();

        while(st.hasMoreTokens())
             list.add(st.nextToken());

        for(var x : list) {
            System.out.println(x); //we are prinitng all the values or accessing the values
        }

        StringJoiner sj = new StringJoiner("-");

        for(var x1 : list) { //here accessing list values to x1 variable

            sj.add(x1); //here adding x1 values to sj.
        }

        System.out.println(sj);

        String x3 = String.valueOf(sj); //here we are converting stringjoiner to string.
        System.out.println(x3);
        String x4 = sj.toString(); //this is also same it converting string type.and toString() returns address of the object also but here sj converting into a string.
        System.out.println(x4);
    }
}
