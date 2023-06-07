import java.util.List;

public class SuppressWarningUnchecked {

    static List list;
@SuppressWarnings("unchecked") //it tells programmer believes that the code to be safe and won't cause unexpected exceptions.
    public static void main(String[] args) {

        list.add(30);

    }
}
