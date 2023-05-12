import java.util.Vector;
public class RemoveFunInVector {

    public static void main(String[] args) {
        

        Vector<Integer> v = new Vector<>();
        v.add(10);
        v.add(30);
        v.add(40);
        v.add(90);
        v.add(50);
        v.add(80);
        v.add(35);

        v.remove(5); //it removes 5nd index value.here we mentioning index name.
        v.remove((Integer)40); //here we are mentioning value not index name.also working.
        v.remove((Object)30); //it also working because object is a parent class of every class.
        v.removeElement(35); //here also mentioning value.

        System.out.println(v);
    }
    
}
