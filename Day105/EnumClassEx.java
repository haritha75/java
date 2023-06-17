//enum is class it is contains methods and fields.
//it is like a radio button that means in several option choose only one option at a time.
//mainly used to replace the use of int constants.
public class EnumClassEx {

    public static void main(String[] args) {

        Size1 s= Size1.MEDIUM;
        //System.out.println(s.getSize());


    }
}
enum Size1 {

SMALL("the size is small"),
LARGE("the size is large"),

MEDIUM("the size is medium");

private final String dressSize;


private Size1(String dressSize) {
    this.dressSize = dressSize;
    System.out.println(this.dressSize);
}
public String  getSize() {
    return dressSize;
}



}