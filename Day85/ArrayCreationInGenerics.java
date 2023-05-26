import java.util.Arrays;

public class ArrayCreationInGenerics {

    public static void main(String[] args) {

        Colors<String> c = new Colors<>();

        c.addColors(0,"purple");
        c.addColors(1,"pink");
        c.addColors(2,"red");
        c.addColors(3,"white");
        c.addColors(4,"green");

        System.out.println(c);


    }
}
class Colors<S> {

    Object colors[]; //whenever creating array in generics use object type.here we are declaring the array using object type

    Colors() {

        colors = new Object[5]; //also mention here also object type.here assigning the size of the array
    }
    void addColors(int ind, S colors1) {
        colors[ind] = colors1;
    }

    @Override
    public String toString() {
        return "Colors{" +
                "colors=" + Arrays.toString(colors) +
                '}';
    }


}