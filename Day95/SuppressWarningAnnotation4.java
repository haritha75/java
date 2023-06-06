import java.util.ArrayList;
import java.util.List;

public class SuppressWarningAnnotation4 {

    @SuppressWarnings("unused") //it applyed to the main method so in main method whatever statements all are appled ot the SuppressWarningAnnotation.

    public static void main(String[] args) { //here also we are creating variable but not using a variable

        int a = 10;
        int b= 21;
        List<Integer> list = new ArrayList<>();
        list.add(b);
        System.out.println(list);
    }
}
