import java.util.Vector;
public class AddFunInVector {

    public static void main(String[] args) {

        Vector v = new Vector();
        v.add(20);
        v.add(30);
        v.add(13);
        v.add(40);
        v.add(2,90); //it adding into the 2nd index remaining values moves into next index.i means 2nd index values als moves into next index.
        v.set(4,80); //here set fun is used to update the value or modifing the value in mentioning index.
        v.insertElementAt(300, 5); //it also used to inserting the value in array like adding element.

        v.add(7,60); //its not working because we are skiping the index if you want add the values.add values line wise donot skip.here we are missing 5,6 indexes.
        

        System.out.println(v);
        
        
    }
    
}
