//shallow copy is one type of cloning of an object. means copy the same object.
public class MarkerInterfaceWorksInternallyInJVM {

    public static void main(String[] args) {

        SBI s = new SBI();
        if(s instanceof RBI) { //like this internally marker interface works in jvm.means jvm check whether the sbi implements the rbi or have the permission or not if have then it allow otherwise not.

            System.out.println("allow operations to be performed in india");
        }
        else {
            System.out.println("take approval from rbi");
        }

        ICICI c = new ICICI();

        if(c instanceof RBI) {

            System.out.println("allow operations to be performed in india");

        }
        else {
            System.out.println("take approval from rbi");
        }


    }
    
}
class SBI implements RBI {

    int a;
    void print() {

        System.out.println("hello.......");
    }
}
class ICICI {


}

interface RBI { //it is a custom marker interface.

}