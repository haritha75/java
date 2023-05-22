import java.util.StringJoiner;

public class StringJoiner12 {

    public static void main(String[] args) {

        String arr[] = {"haritha","ramya","harika","dilshad"};

        StringJoiner sj = new StringJoiner("-");

        for (int i = 0; i < arr.length; i++) {

            sj.add(arr[i]); //here adding arrary values to stringjoiner

        }
        System.out.println(sj);
    }
}
