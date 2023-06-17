//enum is class it is contains methods and fields.
//it is like a radio button that means in several option choose only one option at a time.
//mainly used to replace the use of int constants.
public class EnumClass {

    public static void main(String[] args) {

        System.out.println(Size.SMALL.getSize());
        System.out.println(Size.EXTRALARGE.ordinal()); //it returns position of the field.
        System.out.println(Size.LARGE.compareTo(Size.EXTRALARGE));
        String res = Size.EXTRALARGE.toString();
        System.out.println(res);
        System.out.println(Size.MEDIUM);

        for(Size x : Size.values())
            System.out.println(x);

    }
}
enum Size{

    SMALL,MEDIUM,LARGE,EXTRALARGE;
    public String getSize() {
        switch (this) { //here whatever we select filed that will be taken.
            case SMALL:
                return "small";

            case MEDIUM:
                return "medium";
            case LARGE:
                return "large";

            case EXTRALARGE:
                return "extralaarge";
            default:
                return null;
        }

        }

}