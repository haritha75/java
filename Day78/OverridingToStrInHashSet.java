    

import java.util.HashSet;
import java.util.Iterator;
public class OverridingToStrInHashSet {

    public static void main(String[] args) {

        HashSet<Car> set = new HashSet<>();

        Car c1 = new Car();
        c1.setName("maruthi");
        c1.setWidth(20);

        Car c2 = new Car();
        c2.setName("bmw");
        c2.setWidth(90);

        Car c3 = new Car();
        c3.setName("benz");
        c3.setWidth(55);

        set.add(c1);
        set.add(c2);
        set.add(c3);
        //System.out.println(set); // here object printing so it returns address of the c1,c2,c3 address.because in object class  toString() method default calling without mentioning.ToString method returns object address.
        //System.out.println(c1);
       // System.out.println(c2);
        //System.out.println(c3);

        Iterator<Car> it = set.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
        

    }
    
}
class Car  extends Object{

    private String name;
    private int width;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
    @Override
    public String toString() { //here we are overriding tostring method so it returns below values only.
        return "Car{" +
                "name='" + name + '\'' +
                ", width=" + width +
                '}';
    }
}
