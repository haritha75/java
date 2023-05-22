import java.util.StringJoiner;

//String joiner means  joining the different words in a single line using delimeter.
public class StringJoiner11 {

    public static void main(String[] args) {

        StringJoiner sj = new StringJoiner("-");

        sj.add("ramya");
        sj.add("haritha");
        sj.add("reddy");
        sj.add("vishala");

        System.out.println(sj);


    }

}
