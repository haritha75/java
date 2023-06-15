import java.io.FileOutputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;
import java.io.Serializable;

public class FileOutputStreamAndObjectOutputStream {

    public static void main(String[] args) {
        

        try {

            SoftwareEngineer se = new SoftwareEngineer();
            se.setName("haritha");
            se.setAge(21);
            se.setWeight(42.5);
            
            FileOutputStream fos = new FileOutputStream("Duck.txt");
            ObjectOutputStream obs = new ObjectOutputStream(fos) ; //it is also working same dataoutputstream but only difference is it write total object at a time.that means whatever in that object that all are writtten at at time.it also create binary file means whatever we write that will be in the form binary form.
                
            obs.writeObject(se);
            

            long serialUID = ObjectStreamClass.lookup(se.getClass()).getSerialVersionUID();
            System.out.println(serialUID); 


            obs.close();
            fos.close();
                
            
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
}
class SoftwareEngineer implements Serializable { //here, serializable means it is one type of interface. it is used to converting object to stream. 

    static String name; 
    int age;
   transient double weight;  //if you want to avoid a data member to be serilizable,then you write the transient keyword.
    void sayHi() {
        System.out.println("Hi"+this.name);
    }
     static void hi(int a) {
        int ab =10000;
        System.out.println(ab);
        System.out.println("static methods also not serilizable because it does not stored in object it stored in class only but in above we use objectoutputstream that means whatever stored in object that only read.");
     }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    

}